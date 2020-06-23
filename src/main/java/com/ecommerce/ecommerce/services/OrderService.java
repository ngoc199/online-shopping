package com.ecommerce.ecommerce.services;

import java.util.List;

import com.ecommerce.ecommerce.entities.Order;
import com.ecommerce.ecommerce.entities.User;
import com.ecommerce.ecommerce.repositories.OrderRepository;

import org.springframework.stereotype.Service;

/**
 * @author ngoc
 */

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Find all orders in the database
     * 
     * @return list of order
     */
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    /**
     * Find order by id
     * 
     * @param id
     * @return order
     */
    public Order findOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

    /**
     * Save order to the database. Update is included
     * 
     * @param order
     * @return saved order
     */
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Find All Orders By User
     * 
     * @param user
     * @return list of order
     */
    public List<Order> findOrderByUser(User user) {
        return orderRepository.findByUser(user);
    }
}