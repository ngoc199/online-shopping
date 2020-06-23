/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ecommerce.ecommerce.entities.enums.UserRole;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 * @author ngoc
 */

@Table(name = "User")
public abstract class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User ID")
    private Long userID;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String userPassword;

    @Getter
    @Setter
    private String userEmail;

    @Getter
    @Setter
    private String userPhone;

    @Getter
    @Setter
    private UserRole userRole;

    public User() {
    }

    public User(UserRole userRole) {
        this();
        this.userRole = userRole;
    }

    public User(String username, String userPassword, String userEmail, String userPhone, UserRole userRole) {
        this(userRole);
        this.username = username;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

}
