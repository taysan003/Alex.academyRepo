package advance;

/*Problem: Write a program which will print reverse of given numbers using recursion.
Example: 123456789=> 987654321*/

import java.util.Scanner;

public class ReverseNumbersUsingRecursion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the number: ");
        long number = input.nextLong();
        input.close();

        long [] numbers = new long [String.valueOf(number).length()];
        int i = String.valueOf(number).length()-1;
        while (number>0){

                numbers[i] = number%10;
                number/=10;
                i--;

        }
        /*for (long t: numbers) {
            System.out.println(i);
        }*/
        reverse(numbers);

    }
    private static void reverse(long[] numbers){
        if (numbers.length==0)
            return;
        long[] numbers2 = new long[numbers.length-1];
        for (int i = 0; i <numbers.length-1 ; i++) {
            numbers2[i] = numbers2[i+1];
            reverse(numbers2);
            System.out.println(numbers[0]);
        }
    }
}
