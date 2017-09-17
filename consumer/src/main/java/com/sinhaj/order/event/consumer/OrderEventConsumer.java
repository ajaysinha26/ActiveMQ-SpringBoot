package com.sinhaj.order.event.consumer;

import com.sinhaj.order.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by ajaysinha on 17/09/17.
 */
@Component
public class OrderEventConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderEventConsumer.class);

    @JmsListener(destination = "order.events")
    public void receiveOrderEvent(String order) {
        LOGGER.info(String.format("Received order event: %s", order));
    }
}
