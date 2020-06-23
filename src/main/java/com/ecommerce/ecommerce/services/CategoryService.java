package com.ecommerce.ecommerce.services;

import java.util.List;

import com.ecommerce.ecommerce.entities.Category;
import com.ecommerce.ecommerce.repositories.CategoryRepository;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    /**
     * Find all categories in the database
     * 
     * @return list of category
     */
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    /**
     * Find category by id
     * 
     * @param id
     * @return category
     */
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    /**
     * Save category to the database. Update is included
     * 
     * @param category
     * @return saved category
     */
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}