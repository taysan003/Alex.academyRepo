package numbers;

/*
Example 11001=>binary
Problem: write a program which will check the given number is binary number or not.
*/

import java.util.Scanner;

public class BinaryOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 10 digits or less: ");
        while (!input.hasNextInt()) {
            System.out.print("That's not a number or more than 10 digits");
            input.next();
        }
        int number = input.nextInt();
        input.close();

        System.out.println(number + " is ");
        String result = "binary";
        while (number != 0) {
            int temp = number % 10; //Evaluating last digit
            if (temp > 1) {
                result = "not binary";
                break;
            } else {
                number = number / 10; //Removing the last digit
            }
        }
        System.out.println(result);
    }
}
