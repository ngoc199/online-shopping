/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce.entities;

import java.util.Date;

import com.ecommerce.ecommerce.entities.enums.UserRole;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 */

public class Customer extends User {

    @Getter
    @Setter
    private Date dateOfBirth;

    @Getter
    @Setter
    private boolean gender;

    public Customer() {
        super();
    }

    public Customer(String username, String userPassword, String userEmail, String userPhone, UserRole userRole) {
        super(username, userPassword, userEmail, userPhone, userRole);
    }

}
