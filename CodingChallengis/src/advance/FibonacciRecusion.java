package advance;

import java.util.Scanner;

/*
Problem: Write a program which will print Fibonacci sequece of given number using recursion.
Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233*/
public class FibonacciRecusion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        input.close();

        for (int i = 0; i <number ; i++) {
            System.out.println(fibonacci (i));
        }
    }

    private static long fibonacci(int number){
        if (number==0)
            return 0;
        else if (number == 1 || number == 2)
            return 1;
        long fib = fibonacci(number-1) + fibonacci(number-2);

        return fib;

    }
}
