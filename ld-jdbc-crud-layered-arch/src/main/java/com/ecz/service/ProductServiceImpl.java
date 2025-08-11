package com.ecz.service;

import com.ecz.model.Product;
import com.ecz.repository.ProductRepository;

import java.util.List;
import java.util.logging.Logger;

public class ProductServiceImpl implements ProductService {
    private static final Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());
    private final ProductRepository productRepository;

    // Constructor injection for dependency injection
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean addProduct(Product product) {
        // Validation is handled by Product and ProductRepository
        return productRepository.addProductToCart(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public boolean updateProduct(Product product) {
        if (product == null) {
            logger.warning("Attempted to update null product");
            return false;
        }
        // Check if product exists in the repository
        List<Product> products = productRepository.getAllProducts();
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                return productRepository.addProductToCart(product); // Overwrites existing product
            }
        }
        logger.warning("Product with ID " + product.getId() + " not found for update");
        return false;
    }
}
