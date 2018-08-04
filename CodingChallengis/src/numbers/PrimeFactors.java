package numbers;

/*Prime FActors of a positive integer are the prime numbers that divide that integer exactly
Example: 99=>3*3*11
Problem: Write a program wich accepts a number and print out its prime factors.*/

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");

        long number = input.nextLong();
        input.close();

        for (int i = 2; i <=number ; i++) {
            while (number%i==0){
                System.out.println(i);
                number/=i;
            }
        }

    }

}
