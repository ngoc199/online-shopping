/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce.entities;

import com.ecommerce.ecommerce.entities.enums.UserRole;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hungv
 * @author ngoc
 */

public class Admin extends User {

    @Getter
    @Setter
    private String shopName;

    @Getter
    @Setter
    private String shopAddress;

    @Getter
    @Setter
    private String shopPhone;

    public Admin() {
        super();
    }

    public Admin(String username, String userPassword, String userEmail, String userPhone, UserRole userRole) {
        super(username, userPassword, userEmail, userPhone, userRole);
    }

}
