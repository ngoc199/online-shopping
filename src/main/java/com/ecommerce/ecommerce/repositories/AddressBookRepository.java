package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.AddressBook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {

}