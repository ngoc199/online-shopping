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
public class Address {
    private long addressBookID;
    private long addressID;
    private String receiverName;
    private String receiverPhone;
    private String city;
    private String district;
    private String ward;
    private String street;
    private AddressType addressType;
    
    public Address(){};

    public Address(long addressBookID, long addressID, String receiverName, String receiverPhone, String city, String district, String ward, String street, AddressType addressType) {
        this.addressBookID = addressBookID;
        this.addressID = addressID;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.street = street;
        this.addressType = addressType;
    }

    public long getAddressBookID() {
        return addressBookID;
    }

    public long getAddressID() {
        return addressID;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
    
}
