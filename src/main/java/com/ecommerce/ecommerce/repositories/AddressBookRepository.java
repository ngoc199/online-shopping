package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.AddressBook;
import com.ecommerce.ecommerce.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ngoc
 */
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {
    public AddressBook findByUser(User user);
}