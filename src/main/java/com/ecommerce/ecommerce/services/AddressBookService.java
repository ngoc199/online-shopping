package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.entities.AddressBook;
import com.ecommerce.ecommerce.entities.User;
import com.ecommerce.ecommerce.repositories.AddressBookRepository;

import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    private final AddressBookRepository addressBookRepository;

    public AddressBookService(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    /**
     * Save address book to the database. Update is included
     * 
     * @param addressBook
     * @return saved address book
     */
    public AddressBook saveAddressBook(AddressBook addressBook) {
        return addressBookRepository.save(addressBook);
    }

    /**
     * Find address book by user
     * 
     * @param user
     * @return address book
     */
    public AddressBook findAddressBookByUser(User user) {
        return addressBookRepository.findByUser(user);
    }
}