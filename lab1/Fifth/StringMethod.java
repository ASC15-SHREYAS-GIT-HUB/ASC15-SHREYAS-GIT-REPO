package com.demo.labs.lab1.Fifth;

public class StringMethod {
    public static void main(String[] args) {
        String str = " Hello, World! ";
        String str2 = "hello, world!";

        System.out.println("charAt(7: "+ str.charAt(7));
        System.out.println("contains(\"World\") : "+ str.contains("World"));
        System.out.println("length(): "+str.length());
        System.out.println("index('o'): "+ str.indexOf('o'));
        System.out.println("equals(str2):" + str.equals(str2));
        System.out.println("equalsIgnoreCase(str2): " + str.trim().equalsIgnoreCase(str2));
        String joined = String.join(" - ","Java","Python","C++");
        System.out.println("Join: "+joined);
        System.out.println("lastIndexOf('l'): " + str.lastIndexOf('l'));
        System.out.println("substring(2,7): "+str.substring(2,7));
        System.out.println("toLowerCase(): "+str.toLowerCase());
        System.out.println("toUpperCase(): "+str.toUpperCase());
        System.out.println("trim(): \"" +str.trim()+ "\"");

    }
}
