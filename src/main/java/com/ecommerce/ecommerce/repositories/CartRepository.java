package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}