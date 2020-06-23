package com.ecommerce.ecommerce.repositories;

import java.util.List;

import com.ecommerce.ecommerce.entities.Order;
import com.ecommerce.ecommerce.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ngoc
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    public List<Order> findByUser(User user);
}