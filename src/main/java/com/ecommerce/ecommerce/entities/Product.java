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

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 * @author ngoc
 */

@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Product ID")
    @Getter
    private long productID;

    @ManyToOne(targetEntity = Category.class, cascade = CascadeType.ALL)
    @Getter
    private Category category;

    @Getter
    @Setter
    private String productName;

    @Getter
    @Setter
    private String productImage;

    @Getter
    @Setter
    private double productPrice;

    @Getter
    @Setter
    private String productDescription;

    public Product() {
    }

    public Product(long productID, Category category, String productName, String productImage, double productPrice,
            String productDescription) {
        this.productID = productID;
        this.category = category;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

}
