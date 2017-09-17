package com.sinhaj.order.event.publisher;

import com.sinhaj.order.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * Created by ajaysinha on 17/09/17.
 */
@Component
public class OrderEventPublisher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderEventPublisher.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    public void send(Order order) {
        LOGGER.info(String.format("Publishing Order event: %s", order));
        jmsTemplate.convertAndSend(queue, order.toString());
        LOGGER.info(String.format("Published Order event: %s", order));
    }
}
