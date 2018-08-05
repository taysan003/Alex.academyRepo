package strings;

import java.util.Scanner;

/*Problem: Write a program which will print a string in reverce:
Example: abcdef=>fedcba*/
public class ReverseString {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        input.close();

        String reverse = new  StringBuilder(string).reverse().toString();
        System.out.println(reverse);*/

       Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        input.close();
        char [] chr = string.toCharArray();
        String reverse ="";
        for (int i = chr.length-1; i >=0; i--) {
            reverse += chr[i];
        }
        System.out.println(reverse);


    }
}
