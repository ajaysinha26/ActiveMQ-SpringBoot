package com.sinhaj.order.model;

import java.io.Serializable;

/**
 * Created by ajaysinha on 17/09/17.
 */
public class Order implements Serializable{
    private static final long serialVersionUID = 42L;

    private String orderNo;
    private String eventName;

    public Order() {}

    public Order(String orderNo, String eventName) {
        this.orderNo = orderNo;
        this.eventName = eventName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
