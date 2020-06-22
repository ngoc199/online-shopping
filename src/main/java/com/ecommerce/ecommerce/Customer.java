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
public class Customer extends User {
    private Date dateOfBirth;
    private boolean gender;
    
    
    public Customer() {
    }

        
    public Customer(String username, String userPassword, String userEmail, String userPhone, UserRole userRole) {
        super(username, userPassword, userEmail, userPhone, userRole);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
    
    
}
