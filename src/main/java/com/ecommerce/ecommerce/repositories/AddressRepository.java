package com.ecommerce.ecommerce.repositories;

import java.util.List;

import com.ecommerce.ecommerce.entities.Address;
import com.ecommerce.ecommerce.entities.AddressBook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    public List<Address> findByAddressBook(AddressBook addressBook);
}