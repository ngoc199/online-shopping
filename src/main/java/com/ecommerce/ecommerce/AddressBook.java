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
public class AddressBook {
    private long addressBookID;
    private long userID;

    public AddressBook(long userID) {
        this.userID = userID;
    }

    public long getAddressBookID() {
        return addressBookID;
    }

    public long getUserID() {
        return userID;
    }
    
    
}
