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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ecommerce.ecommerce.entities.enums.AddressType;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 * @author ngoc
 */

@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Address ID")
    @Getter
    private Long addressID;

    @Getter
    @ManyToOne(targetEntity = AddressBook.class, cascade = CascadeType.ALL)
    private AddressBook addressBook;

    @Getter
    @Setter
    private String receiverName;

    @Getter
    @Setter
    private String receiverPhone;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String district;

    @Getter
    @Setter
    private String ward;

    @Getter
    @Setter
    private String street;

    @Getter
    @Setter
    private AddressType addressType;

    public Address() {
    };

    public Address(AddressBook addressBook, long addressID, String receiverName, String receiverPhone, String city,
            String district, String ward, String street, AddressType addressType) {
        this();
        this.addressBook = addressBook;
        this.addressID = addressID;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.street = street;
        this.addressType = addressType;
    }

}
