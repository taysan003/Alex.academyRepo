package numbers;

import java.util.Scanner;

/*Abundant number is a number for which the sum of its proper divisors is greater than number.
Example: 12=>1+2+3+4+6=18>12
Problem: Write a program which will print abundant numbers up to given number.
 Enter 50
 Get 12, 18, 20, 24, 30 36, 40, 42, 48*/
public class AbundantNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        input.close();

        for (int i = 1; i <=number ; i++) {
            if(isAbundant(i)){
                System.out.println( + i);
            }
        }



    }
    public static boolean isAbundant(int n){
        int temp =0;

        for (int i = 1; i <=n/2 ; i++) {
            if (n%i==0){
                temp +=i;
            }

        }
        if(temp>n)
            return true;
        else
            return false;

    }

}
