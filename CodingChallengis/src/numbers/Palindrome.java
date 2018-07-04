package numbers;

import java.util.Scanner;

/*
Palindrome number is a number that is same after reverse.
Example: 454=>palindrome
Problem: Write a program which will check the give number is a palindrome or not.*/
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int origin = number;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        if (origin == reverse) {
            System.out.println(origin + " is palindrom");
        } else {
            System.out.println(origin + " is not palindrom");

        }
    }
}
