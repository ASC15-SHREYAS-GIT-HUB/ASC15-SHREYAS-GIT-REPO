package com.demo.labs.lab1.First;


 class Method_Overloading {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c ;
    }

    float add(float a,float b){
        return a+b;
    }

    String add(String a,String b){
        return a +" "+ b;
    }
}
public class Addition {
    public static void main(String[] args) {
        Method_Overloading method = new Method_Overloading();
        System.out.println(method.add(10, 20));
        System.out.println(method.add(10,20,30));
        System.out.println(method.add(10.5f,20.1f));
        System.out.println(method.add("Hello","20"));
    }
}