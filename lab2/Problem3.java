package com.demo.labs.lab2;

public class Problem3 {
    public static int largest(int a , int b , int c){
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
        System.out.println(largest(1,2,3));
    }
}
