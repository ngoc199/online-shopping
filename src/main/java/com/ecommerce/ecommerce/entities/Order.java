/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ecommerce.ecommerce.entities.enums.OrderStatus;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 * @author ngoc
 */

@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Order ID")
    @Getter
    private Long orderID;

    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private Address address;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Getter
    @Setter
    private LocalDateTime orderDate;

    public Order() {
        this.orderStatus = OrderStatus.NEW;
        this.orderDate = LocalDateTime.now();
    }

    public Order(User user) {
        this();
        this.user = user;
    }

}
