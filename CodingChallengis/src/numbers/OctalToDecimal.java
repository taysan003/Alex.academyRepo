package numbers;

import java.util.Scanner;

/*Problem: Write a program which accepts an octal number and converts it to decimal.
Example: 1750=>1000*/

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal  = input.nextLine();
        input.close();

        if (!octal.matches("^[0-7]+$")){
            System.err.println("Non an octal");
            System.exit(0);
        }
        if(octal.length()>19) {
            System.err.println("Support only 19 digits");
            System.exit(0);
        }
            System.out.println("Octal: " + Integer.parseInt(octal, 8));

            Long oct = Long.valueOf(octal);
            int decimal =0;
            int power = 0;
            while (oct>0){
                decimal += oct % 10 * Math.pow(8, power);
                oct = oct /10;
                power++;
            }
            System.out.println("Decimal: " + decimal);

    }


}
