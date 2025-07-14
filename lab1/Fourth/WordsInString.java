package com.demo.labs.lab1.Fourth;

public class WordsInString {
    public static int countWords(String input)
    {
        if(input == null || input.trim().isEmpty())
        {
            return 0;
        }
        String[] tokens = input.split("\\s+");
        int count = 0;
        for(String token : tokens){
            if(token.matches("\\D+")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Sum of 12 and 20 is 32";
        int wordCount = countWords(text);
        System.out.println("Number of Words(letters only) "+wordCount);
    }

}
