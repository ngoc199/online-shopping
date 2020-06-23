package com.ecommerce.ecommerce.repositories;

import java.util.List;

import com.ecommerce.ecommerce.entities.Category;
import com.ecommerce.ecommerce.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ngoc
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByProductNameContaining(String productName);

    public List<Product> findByCategory(Category category);
}