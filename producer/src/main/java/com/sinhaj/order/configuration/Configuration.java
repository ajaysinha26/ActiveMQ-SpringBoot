package com.sinhaj.order.configuration;

import javax.jms.Queue;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;

/**
 * Created by ajaysinha on 17/09/17.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("order.events");
    }
}
