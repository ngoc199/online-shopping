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

/**
 *
 * @author hungv
 * @author ngoc
 */

@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cart ID")
    @Getter
    private long cartID;

    @Getter
    @OneToOne(targetEntity = User.class, mappedBy = "User ID", cascade = CascadeType.ALL)
    private User user;

    public Cart() {
    }

    public Cart(User user) {
        this.user = user;
    }

}
