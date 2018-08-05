package strings;


import java.util.Scanner;

/*Defenition: Palindrome number is a number that is same reverse.
Problem: Write a program which will check the given srting is palindrome or not.
Example: abba => palindrome*/
public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        input.close();

        String reverse="";
        char [] arrray = string.toCharArray();

        for (int i = arrray.length-1; i >=0 ; i--) {
            reverse+=arrray[i];
        }

        System.out.println(reverse.equals(string)? "palindrom":"Not palindrom");
    }
}
