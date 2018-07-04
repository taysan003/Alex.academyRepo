package numbers;
/*
DecimalToBinary
Example: 1000=>1111101000
Problrm: Write a program which accepts a decimal number and converts it to binary.*/


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive decimal number: ");
        int number = Math.abs(input.nextInt()); //Math.abs(-1) =>1
        input.close();
        int decimal = number;
        String binary = "";
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Binary: " + Integer.toString(decimal, 2));
        while (decimal > 0) {
            binary = String.valueOf(decimal % 2) + binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary of number \"" + number + "\" is " + binary );
    }

}

