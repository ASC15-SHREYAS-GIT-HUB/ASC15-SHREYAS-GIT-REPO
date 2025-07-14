package com.demo.labs.lab1.Fourth;

public class WordsInStringUsingLoops {
    public static int countWords(String input){
        if(input == null || input.trim().isEmpty()){
            return 0;
        }
        int count = 0;
        StringBuilder word = new StringBuilder();

        for(int i = 0;i<input.length();i++)
        {
            char ch = input.charAt(i);

            if(Character.isLetter(ch)){
                word.append(ch);

            }
            else{
                if(word.length()>0){
                    count++;
                    word.setLength(0);
                }
            }
        }
        if(word.length()>0){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Sum of 12 and 20 is 32";
        int wordCount = countWords(text);
        System.out.println("No. of words(letter only): "+wordCount);
    }

}
