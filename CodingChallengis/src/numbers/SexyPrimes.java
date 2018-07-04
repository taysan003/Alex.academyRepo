package numbers;

/*Sexy prime numbers that differ from each other by 6.
Example: (5, 11), (7,13), (11,17), (13, 19), (17,23), (23,29), (31,37), (37, 43)
Problem: Write a program which will print all sexy primes up to given number.*/

import java.util.Scanner;

public class SexyPrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        input.close();

        for (int i = 1; i <=number; i++) {
            if (isPrime(i) && isPrime(i+6)){
                System.out.println( "("+i+ " " + (i+6) +")");
            }

        }
    }

    public static boolean isPrime(int number){
        if (number<=1)
            return false;
        if (number==2)
            return true;
        if (number%2==0)
            return false;

        for (int i = 2; i <number; i++) {
            if (number%i==0)
                return false;


        }
        return true;
    }
}