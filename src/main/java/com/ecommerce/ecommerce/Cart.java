/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.ecommerce;

/**
 *
 * @author hungv
 */
public class Cart {
    private long cartID;
    private long userID;

    public Cart(long userID) {
        this.userID = userID;
    }

    public long getCartID() {
        return cartID;
    }

    public long getUserID() {
        return userID;
    }
    
    
}
