package numbers;

/*Fibonaci sequence of numbers (in modern usage start with 0), each number is the sum of the previous two.
Problem: Write a program which will print out Fibonacci sequence up to given number: 100
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class FibonacciSequence {

    public static void main(String[] args) {
        int max =100;
        BigDecimal fibonacci = BigDecimal.ZERO;
        BigDecimal fibonacc2 = BigDecimal.ONE;
        for (int i = 1; i <=max ; i++) {
            System.out.println(i + " : " + fibonacci);
            fibonacci = fibonacci.add(fibonacc2);
            fibonacc2 = fibonacci.subtract(fibonacc2);
        }
    }



}
