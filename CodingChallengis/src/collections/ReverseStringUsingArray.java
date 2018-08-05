package collections;

import java.util.Scanner;

/*Problem: Write a program which will print a string in reverse using array.
Example: abcdef=>fedcba*/
public class ReverseStringUsingArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        input.close();

        char [] array = string.toCharArray();
        String reverse = "";
        for (int i = array.length-1; i >=0 ; i--) {
            reverse += array[i];
        }
        System.out.println(reverse);
    }
}
