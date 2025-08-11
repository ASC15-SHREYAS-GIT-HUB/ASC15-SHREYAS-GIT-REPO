package com.ecz.ui;

import com.ecz.model.Product;
import com.ecz.service.ProductService;
import com.ecz.service.ProductServiceImpl;
import java.util.List;
import java.util.Scanner;

public class MenuUI {
    private final ProductService productService;
    private final Scanner scanner;

    public MenuUI(ProductService productService) {
        this.productService = productService;
        this.scanner = new Scanner(System.in);
    }

    public MenuUI() {
        this(new ProductServiceImpl(new com.ecz.repository.ProductRepositoryCollectionImpl()));
    }

    void accessMenu() {
        System.out.println("Welcome to ECommerce App!");
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Exit");
    }

    void addProduct() {
        System.out.print("Enter Product ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price. Product not added.");
            return;
        }
        System.out.print("Enter Product Quantity: ");
        int quantity;
        try {
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity. Product not added.");
            return;
        }

        try {
            Product product = new Product(id, name, price, quantity);
            boolean isAdded = productService.addProduct(product);
            if (isAdded) {
                System.out.println("Product added successfully");
            } else {
                System.out.println("Product not added");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void getAllProducts() {
        List<Product> productList = productService.getAllProducts();
        if (productList == null || productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        String id = scanner.nextLine();
        System.out.print("Enter New Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter New Product Price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price. Product not updated.");
            return;
        }
        System.out.print("Enter New Product Quantity: ");
        int quantity;
        try {
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity. Product not updated.");
            return;
        }

        try {
            Product product = new Product(id, name, price, quantity);
            boolean isUpdated = productService.updateProduct(product);
            if (isUpdated) {
                System.out.println("Product updated successfully");
            } else {
                System.out.println("Product not updated");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}