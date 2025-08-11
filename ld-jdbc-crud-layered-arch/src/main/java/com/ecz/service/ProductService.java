package com.ecz.service;

import com.ecz.model.Product;
import java.util.List;

/**
 * Service interface for managing products in the e-commerce application.
 */
public interface ProductService {
    /**
     * Adds a product to the repository.
     * @param product The product to add.
     * @return true if the product was added successfully, false otherwise.
     */
    boolean addProduct(Product product);

    /**
     * Retrieves all products from the repository.
     * @return A list of all products.
     */
    List<Product> getAllProducts();

    /**
     * Updates an existing product in the repository.
     * @param product The product with updated details.
     * @return true if the product was updated successfully, false otherwise.
     */
    boolean updateProduct(Product product);
}