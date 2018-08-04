package numbers;

import java.util.Scanner;

/*Problem: Write a program which accepts hexadecimal number and converts it todecimal
Example: 3e8=>1000*/

public class HexaDacimalToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String hexadecimal = input.nextLine();
        input.close();

        if(!hexadecimal.matches("^[0-9a-fA-F]+$")){
            System.err.println("Not a hexadecimal");
            System.exit(0);
        }
        if(hexadecimal.length()>19){
            System.err.print("Not support");
            System.exit(0);
        }

        System.out.println("Decimal :" + Integer.parseInt(hexadecimal, 16));
        String digits = "0123456789ABCDEF";

        int decimal = 0;
        for (int i = 0; i <hexadecimal.length() ; i++) {
            char c = hexadecimal.toUpperCase().charAt(i);
            int digit = digits.indexOf(c);
            decimal = 16*decimal+digit;

        }
        System.out.println("Decimal: " + decimal);

    }
}
