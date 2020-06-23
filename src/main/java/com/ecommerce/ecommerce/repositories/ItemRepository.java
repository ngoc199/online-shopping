package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Long, Item> {

}