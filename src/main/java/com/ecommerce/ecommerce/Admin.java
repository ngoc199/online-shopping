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
public class Admin extends User {
    private String shopName;
    private String shopAddress;
    private String shopPhone;

    public Admin() {
    }
    
    public Admin(String username, String userPassword, String userEmail, String userPhone, UserRole userRole) {
        super(username, userPassword, userEmail, userPhone, userRole);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }
    
    
}
