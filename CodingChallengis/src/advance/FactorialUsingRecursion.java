package advance;


import java.util.Scanner;

/*Priblem: Write a program which will print a factorial of a given number using recursion.
Example: 5! = 120(5*4*3*2*1)*/
public class FactorialUsingRecursion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        input.close();
        System.out.println("Factorial of number "+ number + " = " + factorial(number));
    }

    private  static long factorial(int number){
        if(number<1)
            return 1;
        else
        return number * factorial(number-1);
    }
}
