package numbers;

import java.util.Scanner;

/*MegaPrime is a number if it is prime and all its digits are prime.
Example: 23, 37, 53, 73, 223, 227, 233, 257, 277, 337, 353
Problem: Write a program which will print out all MegaPrime numbers up to given number.*/
public class MegaPrimeNumbers {
    public static void main(String[] args) {
        Scanner iput =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = iput.nextInt();
        iput.close();
        System.out.println("MegaPrime numbers: ");

        for (int i = 1; i <=number; i++) {

            if(isPrime(i)&&isMegaPrime(i)){
                System.out.print(i+ ", ");
            }
        }

    }
    public static boolean isPrime(int number){
        if (number<=1)
            return false;
        if (number==2)
            return true;
        if(number%2==0)
            return false;
        for (int i = 2; i <number ; i++) {
            if(number%i==0)
                    return false;
        }
        return true;
    }

    public static boolean isMegaPrime(int number){
        if (number<10){
            return false;
        }

        String str = String.valueOf(number);
        String array [] = str.split("");
        for (String mega: array) {
            if(!isPrime(Integer.parseInt(mega))){
                return false;
            }



        }
        return true;

    }

}
