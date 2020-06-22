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
public class Item {
    private long cartID;
    private long productID;
    private long orderID;
    private int quantity;

    public Item() {
    }

    public Item(long cartID, long productID) {
        this.cartID = cartID;
        this.productID = productID;
    }
    
    public int getTotalPrice(){
        
        return 0;
    }

    public long getCartID() {
        return cartID;
    }

    public long getProductID() {
        return productID;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
