package advance;

import java.util.Scanner;

/*Problem: Write a program which will power of given number using recursion.
2*2=>4*/
public class PowerFunctionUsingRecursion
{
    public static void main(String[] args) {
        System.out.println("Enter your base number and exponent: ");
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        int exponent = input.nextInt();
        input.close();
        System.out.println("Base \""+ base + "\" and exponent \"" + exponent+ "\" is " + power(base, exponent));
    }
    private static double power(double number, int exponent){
        if(exponent==0)
            return 1; // Base case
        double result = power(number, exponent/2);
        result  = result*result;
        if (exponent%2 ==0)
            return result;
        return number*result;
    }
}
