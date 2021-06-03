package com.ecommerce.ecommerce.services;

import java.util.List;

import com.ecommerce.ecommerce.entities.Cart;
import com.ecommerce.ecommerce.repositories.CartRepository;

import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    /**
     * Find all carts in the database
     * 
     * @return list of carts
     */
    public List<Cart> findAllCart() {
        return cartRepository.findAll();
    }

    /**
     * Find cart by id
     * 
     * @param id
     * @return cart
     */
    public Cart findCartById(Long id) {
        return cartRepository.findById(id).get();
    }

    /**
     * Save cart to the database. Update is included
     * 
     * @param cart
     * @return
     */
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
}