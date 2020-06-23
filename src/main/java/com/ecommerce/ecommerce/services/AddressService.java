package com.ecommerce.ecommerce.services;

import java.util.List;

import com.ecommerce.ecommerce.entities.Address;
import com.ecommerce.ecommerce.entities.AddressBook;
import com.ecommerce.ecommerce.repositories.AddressRepository;

import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    /**
     * Find all addresses in the database
     * 
     * @return list of address
     */
    public List<Address> findAllAddress() {
        return addressRepository.findAll();
    }

    /**
     * Find address by id
     * 
     * @param id
     * @return address
     */
    public Address findAddressById(Long id) {
        return addressRepository.findById(id).get();
    }

    /**
     * Save address to the database. Update is included
     * 
     * @param address
     * @return saved address
     */
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    /**
     * Find all addresses in the given address book
     * 
     * @param addressBook
     * @return list of address
     */
    public List<Address> findAddressByAddressBook(AddressBook addressBook) {
        return addressRepository.findByAddressBook(addressBook);
    }
}