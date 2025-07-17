package com.demo.labs.lab2;

public class Problem2 {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ",Welcome to Java World!";
    }

    public static void main(String[] args) {
        String name = "Alice";
        String message = welcomeMessage(name);
        System.out.println(message);
    }
}
