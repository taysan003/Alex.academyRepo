package numbers;

/*

Decimal to Octal
Example: 1000=> 1750
Problem: Write a program which accepts a decimal number and converts it to octal;

*/

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number");
        Scanner input = new Scanner(System.in);
        int decimal = Math.abs(input.nextInt());
        input.close();
        String octal = "";
        String octals = "01234567";
        System.out.println("Ocatal is " + Integer.toOctalString(decimal));
        System.out.println("Ocatal is " + Integer.toString(decimal, 8));
        while (decimal>0){
            octal = octals.charAt(decimal%8)+octal;
            decimal/=8;
        }
        System.out.println("Octal " + octal);
    }
}
