package numbers;
/*
Consecutive Or Not
Example: 123=>Consecutive; 985=> Not consecutive;
Problem: Write a program which will check the given number is consecutive or not.
*/

import java.util.Scanner;

public class ConsecutiveOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        input.close();
        int[] numbers = new int[String.valueOf(number).length()];
        int i = String.valueOf(number).length() - 1;

        while (number > 0) {
            numbers[i] = number % 10;
            number /= 10;
            i--;
        }
        System.out.println(isConsecutive(numbers) ? "cons" : "not cons");
    }

    public static boolean isConsecutive(int... numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                if (numbers[i] + 1 != numbers[i + 1]) {
                    return false;
                }
            } else if (numbers[i] > numbers[i + 1]) {
                if (numbers[i] - 1 != numbers[i + 1]) {
                    return false;
                }
            }

        }
        return true;
    }



}
