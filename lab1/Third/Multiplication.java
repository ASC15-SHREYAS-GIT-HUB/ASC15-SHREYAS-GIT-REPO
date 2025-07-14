package com.demo.labs.lab1.Third;

public class Multiplication {
    public static void main(String[] args) {
        Multiply.multiplicationTableFor(5);
        Multiply.multiplicationTableWhile(3);
        Multiply.multiplicationTabledowhile(2);

    }
}

 class Multiply{
    public static void multiplicationTableFor(int n){
        System.out.println("Multiplication Table of"+n+"using for loop:");
        for(int i = 1;i<=10;i++){
           System.out.println(n+"x"+i+"="+(n*i));
        }
    }
    public static void multiplicationTableWhile(int n){
        System.out.println("Multiplication table of"+n+"using while loop:");
        int i = 1;
        while(i<=10){
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }
    }

    public static void multiplicationTabledowhile(int n){
        int i =1;
        do{
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }
        while(i<=10);

    }

}
