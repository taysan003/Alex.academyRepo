package numbers;

/*
Example: 123=>6(1+2+3)
Problem: Write a program which calculate the sum of all given numbers.
*/

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long number  = input.nextLong();
        input.close();
        long sum = 0;
        for (int i = 0; i <String.valueOf(number).length(); i++) {
            sum+=Integer.parseInt(String.valueOf(number).substring(i, i+1));
        }
        System.out.println("Sum is: " + sum);
    }

}
