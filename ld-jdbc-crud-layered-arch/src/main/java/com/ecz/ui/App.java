package com.ecz.ui;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to ECommerce App!");
        MenuUI menuUI = new MenuUI();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuUI.accessMenu();
            System.out.print("Enter your choice (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    menuUI.addProduct();
                    break;
                case "2":
                    menuUI.getAllProducts();
                    break;
                case "3":
                    menuUI.updateProduct();
                    break;
                case "4":
                    System.out.println("Delete Product not implemented yet.");
                    break;
                case "5":
                    System.out.println("Exiting ECommerce App. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

