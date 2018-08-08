package advance;


import java.util.Scanner;

/*Greatest Common Divisor of 2 or more integers, is the largest divisor common to the integers.
Problem: Write a program which will calculate GCD of two given numbers using recursion. */
public class GCDRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a  = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        input.close();
        System.out.println("The GCD " + gcd(a, b));
    }
    private static int gcd(int first, int second){
        if(second==0)
            return first;
        return gcd(second, first%second);
    }
}
