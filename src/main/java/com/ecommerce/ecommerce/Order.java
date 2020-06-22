/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce;

import java.util.Date;

/**
 *
 * @author hungv
 */
public class Order {
    private long orderID;
    private long userID;
    private long addressID;
    private OrderStatus orderStatus;
    private Date orderData;

    public Order(long userID) {
        this.userID = userID;
    }

    public long getOrderID() {
        return orderID;
    }

    public long getUserID() {
        return userID;
    }

    public long getAddressID() {
        return addressID;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderData() {
        return orderData;
    }
    
    
}
