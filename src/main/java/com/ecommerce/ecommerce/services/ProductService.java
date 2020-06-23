package com.ecommerce.ecommerce.services;

import java.util.List;

import com.ecommerce.ecommerce.entities.Category;
import com.ecommerce.ecommerce.entities.Product;
import com.ecommerce.ecommerce.repositories.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Find all product in the database
     * 
     * @return list of products
     */
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    /**
     * Find product by id
     * 
     * @param id
     * @return product
     */
    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    /**
     * Save product to the database. Update is included
     * 
     * @param product
     * @return saved product
     */
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * Find products which contain given name
     * 
     * @param productName
     * @return list of products
     */
    public List<Product> findProductByName(String productName) {
        return productRepository.findByProductNameContaining(productName);
    }

    /**
     * Find products in the given category
     * 
     * @param category
     * @return list of products
     */
    public List<Product> findProductByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    /**
     * Delete product by id
     * 
     * @param id
     */
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}