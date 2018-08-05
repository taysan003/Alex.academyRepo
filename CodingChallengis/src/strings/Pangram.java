package strings;
/*
Defenition: A sentence or verse that contains all the letters of the alphabet (26).
Example: The quick brown fox jumps over the lazy dog
Problem: Write a program which will check the given sentence is pangram or not. */

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentance: ");
        String sentence = input.nextLine();
        input.close();

        System.out.println("Sentence is "+(pangram(sentence)? "pangram":"not pangram"));


    }
    public static boolean pangram(String santence){
        santence =santence.toLowerCase();
        if(santence.length()<26)
            return false;
        for (char c = 'a'; c <= 'z'; c++) {
            if (santence.indexOf(c)<0){
                return false;
            }
        }
        return true;
    }

}
