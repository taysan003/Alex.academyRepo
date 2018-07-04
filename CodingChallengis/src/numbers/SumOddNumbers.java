package numbers;

/*Example: 10=> 25(1+3+5+7+9)
Problem: Write a program which calculates the sum of all odd numbers up to given number.*/


import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        input.close();
        if (number> 999_999_999){
            System.out.println("Up to 999999999");
            System.exit(0);
        }
        System.out.print("Sum of odd numbers between 1 - " + number + ": ");
        long sum = 0;
        for (int i = 0; i <=number; i++) {
            if (i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
