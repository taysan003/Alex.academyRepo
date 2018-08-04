package numbers;

/*
Greatest Common Divisor of 2 or more integers, is the largest divisor common to the integers.
Example: 7, 42 =>7
Problem: Write a program which calculates GCD of two given numbers by using Euclids algorithm.
*/

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int first = input.nextInt();
        System.out.println("Enter the second number ");
        int second = input.nextInt();
        System.out.println("GCD of "+ first +" and "+ second+ " = " + gcd(first, second));



    }
    public  static  int gcd(int first, int second){
        while (second!=0){
            int temp = second;
            second = first%second;
            first = temp;
        }
        return first;
    }
}
