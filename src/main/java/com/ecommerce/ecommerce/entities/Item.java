/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 * @author ngoc
 */
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Item ID")
    private Long itemId;

    @Getter
    @OneToOne(targetEntity = Cart.class, mappedBy = "Cart ID", cascade = CascadeType.ALL)
    private Cart cart;

    @Getter
    @OneToOne(targetEntity = Product.class, mappedBy = "Product ID", cascade = CascadeType.ALL)
    private Product product;

    @Getter
    @OneToOne(targetEntity = Order.class, mappedBy = "Order ID", cascade = CascadeType.ALL)
    private long orderID;

    @Setter
    @Getter
    private int quantity;

    public Item() {
        this.quantity = 1;
    }

    public Item(Cart cart, Product product) {
        this();
        this.cart = cart;
        this.product = product;
    }

    public int getTotalPrice() {
        // Chưa hoàn thành
        return 0;
    }

}
