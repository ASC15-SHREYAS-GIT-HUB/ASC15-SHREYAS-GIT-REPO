package com.demo.labs.lab2;

public class Problem4 {
    public static void printDigitsInWords(int number){
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String numStr = String.valueOf(number);
        for(char digit : numStr.toCharArray()){
            System.out.print(words[digit - '0'] + " ");
        }
    }

    public static void main(String[] args) {
        printDigitsInWords(1234567);
    }
}
