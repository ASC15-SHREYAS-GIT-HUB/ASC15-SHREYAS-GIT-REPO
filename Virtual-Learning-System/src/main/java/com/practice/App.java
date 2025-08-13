package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Welcome to our Virtual Learning App!!" );
        SpringApplication.run(App.class, args);
        System.err.println("Welcome to our Modified Spring Virtual Learning App!! ");
    }
}
