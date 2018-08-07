package advance;

import java.util.Scanner;

/*Problem: Write a program which will calculates the sum of all odd numbers up to given number using recursion.
Example: 10=>25(1+3+5+7+9)*/
public class SumOfOddNumbersUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number = input.nextLong();
        input.close();
        if (number>9999){
            System.out.println("Increase memory stack");
            System.exit(0);
        }
        System.out.println("Sum of odd numbers "+ summOdd(number)+   " up to " + number);

    }
    private static long summOdd(long n){
        if (n==0)
            return 0;
        else if (n%2!=0){
             return n + summOdd(n-1);
        } else
            return summOdd(n-1);

    }
}
