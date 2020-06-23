package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}