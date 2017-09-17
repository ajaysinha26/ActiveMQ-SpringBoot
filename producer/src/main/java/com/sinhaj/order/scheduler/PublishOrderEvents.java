package com.sinhaj.order.scheduler;

import com.sinhaj.order.event.publisher.OrderEventPublisher;
import com.sinhaj.order.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by ajaysinha on 17/09/17.
 */
@Component
public class PublishOrderEvents {
    private static final Logger LOGGER = LoggerFactory.getLogger(PublishOrderEvents.class);

    @Autowired
    private OrderEventPublisher orderEventPublisher;

    private int count = 0;
    private int orderNo = 1;

    @Scheduled(fixedRate = 60000)
    public void run() {
        LOGGER.info(String.format("count[%d] order no[%d]", count, orderNo));
        switch (count%4) {
            case 0:
                orderEventPublisher.send(new Order(String.valueOf(orderNo), "ORDER_CREATED"));
                break;
            case 1:
                orderEventPublisher.send(new Order(String.valueOf(orderNo), "ORDER_SHIPPED"));
                break;
            case 2:
                orderEventPublisher.send(new Order(String.valueOf(orderNo), "ORDER_RECEIVED"));
                break;
            case 3:
                orderEventPublisher.send(new Order(String.valueOf(orderNo), "ORDER_INVOICED"));
                orderNo++;
        }
        count++;
    }
}
