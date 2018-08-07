package advance;

import java.util.Scanner;

/*Problem: Write a program which accepts a decimal number and converts it to binary using recursion.
1000=>1111101000*/
public class DecimalAndBinaryUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        long number = Math.abs(input.nextLong());
        input.close();

        System.out.println("Binary : " + binary(number) + " of decimal number "+ number);
    }

    private static String binary(long number){
        if(number>0)
            return binary(number/2 ) + ""+ number%2;
        return "";
     }
}
