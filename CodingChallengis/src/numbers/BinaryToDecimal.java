package numbers;
/*

Problem: Write a program which accepts a binary number and converts it to decimal.
Example: 1111=>15
*/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary =input.nextLine();
        input.close();
        if(!binary.matches("^[01]+$")){
            System.err.println("Not a binary");
            System.exit(0);
        }
        if(binary.length()>19){
            System.err.println("Support only 19 digits");
            System.exit(0);

        }
        System.out.println("Decimal: " + Integer.parseInt(binary, 2));
        Long bin = Long.valueOf(binary);
        int decimal = 0;
        int power =0;
        while (bin>0){
            decimal+= bin%10 * Math.pow(2, power);
            bin = bin/10;
            power++;}

        System.out.println("Decimal: " + decimal);


    }
}
