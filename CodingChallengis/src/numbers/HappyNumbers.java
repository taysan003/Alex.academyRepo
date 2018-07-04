package numbers;

/*Happy numbers is a positive integer, replace the number by the sum of the squares of its digits, and repeat
the process until the number equals 1, if it loops endlessly its called Unhappy number.
7->49->97->130->10->1  22->8->64->52->29->85->89->145->42->20->4->16->37...
Example: Write a programm which will check the given number is Happy number or not.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumbers {
    public static boolean isHappy(int number) {
        Set<Integer> unique = new HashSet<>();
        while (unique.add(number)) {
            int value = 0;
            while (number > 0) {
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }
        return number == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        input.close();
        System.out.println(number + " is ");
        System.out.println(isHappy(number) ? "Happy number" : "Unhappy number");
    }
}

