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

@Table(name = "Address Book")
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "Address Book ID")
    private long addressBookID;

    @Getter
    @OneToOne(targetEntity = User.class, mappedBy = "User ID", cascade = CascadeType.ALL)
    private User user;

    public AddressBook() {
    }

    public AddressBook(User user) {
        this();
        this.user = user;
    }

}
