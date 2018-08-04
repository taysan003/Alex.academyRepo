package numbers;
/*Even numbers (positive or negative, not a fraction, including 0), wich is divisible by 2.
Example: -6, -2, 0, 8, 20
Problem: Print out even numbers up to given number: 10
2, 4, 6, 8, 10*/
/*public class TestClass {
    public static void main(String[] args) {

    }

}*/

/*Odd numbers is an integer (positive or negative, not a fraction), which is not divisible by 2.
Example: -3, -1, 7, 11

Problem: Print out odd numbers up to given number: 9*/
/*public class TestClass {
    public static void main(String[] args) {

    }

}*/

/*Prime number is a number (positive only) which only divisible by 1 and itself.
Epample: 2, 3, 5, 7, 11, 13, 17

Problem: Print out prime numbers up to given number: 100*/
/*public class TestClass {
    public static void main(String[] args) {


    }
}*/


/*Perfect Numbers is a positive integer  that is equal  to the sum of its proper divisors (6 =>1+2+3)
Example: 6, 28, 496, 8128, 33_550_336

Problem: Print out perfect numbers up to given number: 10000*/


/*Happy numbers is a positive integer, replace the number by the sum of the squares of its digits, and repeat
the process until the number equals 1, if it loops endlessly its called Unhappy number.
7->49->97->130->10->1  22->8->64->52->29->85->89->145->42->20->4->16->37...
Example: Write a programm which will check the given number is Happy number or not.*/


/*Factorial function (symbol:!) means to multiply a series of descending natural numbers.
Example: 5!=120(5*4*3*2*1)
Problem: Write a Java program for factorial of a given number: 6*/

/*Fibonaci sequence of numbers (in modern usage start with 0), each number is the sum of the previous two.
Problem: Write a program which will print out Fibonacci sequence up to given number: 100
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765*/

/*Collatz Sequence -if n is 1, stop; if n is even, the next number is n/2; if n is odd, the next number is n*3+1
aka: Hailstone, Kakutani, Hasse, Syracuse, 3n+1 Sequence
Example: 3: 10(3*3+1), 5(10/2), 16(5*3+1), 16(5*3+1), 8(16/2), 4, 2, 1
4: 2, 1; 5: 16, 8, 2, 1; 6: 3, 10, 5, 16, 8, 4, 2, 1;
Enter a number: 25
CS is: 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13*/

/*
Sum of digits
Example: 123=>6(1+2+3)
Problem: Write a program which calculate the sum of all given numbers.
*/

/*Example: 10=> 25(1+3+5+7+9)
Problem: Write a program which calculates the sum of all odd numbers up to given number.*/

/*
Leap year is containing 366 day (February 29), divisible by 4 and 400, but not by 100. October 15, 1582
Example: 2000=>leap year
Problem: Write a program which will check the given year is leap or not.
*/

/* Binary Or Not
Example 11001=>binary
Problem: write a program which will check the given number is binary number or not.
*/

/*
Example: 123=>Consecutive; 985=> Not consecutive;
        Problem: Write a program which will check the given number is consecutive or not.
*/

/*
Consecutive Or Not
Example: 123=>Consecutive; 985=> Not consecutive;
Problem: Write a program which will check the given number is consecutive or not.
*/

/* Palindrom or not
Palindrome number is a number that is same after reverse.
Example: 454=>palindrome
Problem: Write a program which will check the give number is a palindrome or not.*/


/*Sexy prime numbers that differ from each other by 6.
Example: (5, 11), (7,13), (11,17), (13, 19), (17,23), (23,29), (31,37), (37, 43)
Problem: Write a program which will print all sexy primes up to given number.*/

/*Quadrant
Quarter of a circle is an arc of 90.
Example: 0-89=>1;  90-179=>2; 180-269=>3; 270-359=>4
Problem: Write a program which accepts an angle and prints its quadrant.*/

/*

Example: 10, 4, 25, =>4 10 25
Problem: Write a program which accepts 3 numbers and sort them in ascending order
*/

/*Average
Example: 2, 5, 9 =>8
Problem: Write a program which takes "X" amount of numbers (positive and negative) and find out the average of positive and negative numbers.*/


/*
DecimalToBinary
Example: 1000=>1111101000
Problrm: Write a program which accepts a decimal number and converts it to binary.*/

/*
Decimal to Octal
Example: 1000=> 1750
Problem: Write a program which accepts a decimal number and converts it to octal;
*/

/*Problem: Write a programm which accepts a decimal number and converts it to hexadecimal.
Example: 1000 =>3e8*/


import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hexadecimal = input.nextLine();
        input.close();

        if (!hexadecimal.matches("^[0-9a-fA-F]+$")){
            System.err.print("Not a hexadecimal");
            System.exit(0);
        }
        if(hexadecimal.length()>19){
            System.err.print("Not support > 19");
            System.exit(0);
        }

        System.out.println("Decimal : "+ Integer.parseInt(hexadecimal, 16));
        String digits = "0123456789ABCDEF";
        int decimal =0;

        for (int i = 0; i <hexadecimal.length() ; i++) {
            char c = hexadecimal.toUpperCase().charAt(i);
            int digit = digits.indexOf(c);
            decimal = decimal*16+digit;

        }
        System.out.println("Decimal: "+ decimal);
    }

}


