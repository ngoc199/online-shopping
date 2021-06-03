package com.ecommerce.ecommerce.repositories;

import java.util.List;

import com.ecommerce.ecommerce.entities.Cart;
import com.ecommerce.ecommerce.entities.Item;
import com.ecommerce.ecommerce.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ngoc
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    public List<Item> findByOrder(Order order);

    public List<Item> findByCart(Cart cart);

}