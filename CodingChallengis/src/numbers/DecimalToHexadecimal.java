package numbers;

import java.util.Scanner;

/*Problem: Write a programm which accepts a decimal number and converts it to hexadecimal.
Example: 1000 =>3e8*/

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a possible decimal number: ");
        int decimal = Math.abs(input.nextInt());
        input.close();
        String hexadecimal = "";
        String hexadecimals = "0123456789abcdef";
        System.out.println("Hex: " + Integer.toHexString(decimal));
        System.out.println("Hex: " + Integer.toString(decimal, 16));
        while (decimal > 0){
            hexadecimal = hexadecimals.charAt((decimal%16)) + hexadecimal;
            decimal = decimal /16;
        }
        System.out.println("Hex: " + hexadecimal);
    }
}
