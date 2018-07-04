package numbers;
/*

Example: 10, 4, 25, =>4 10 25
Problem: Write a program which accepts 3 numbers and sort them in ascending order
*/

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        System.out.println("Enter c: ");
        int c = input.nextInt();
        input.close();

        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a > b && b > c) {
            System.out.println(c + " " + b + "" + a);
        } else if (a < b && b < c) {
            System.out.println(a + " " + b + "" + c);
        } else if (a < b && b > c) {
            System.out.println(a + " " + c + "" + c);
        } else if (a == b && b > c) {
            System.out.println(a + " " + b + "" + c);
        } else if (a > b && b == c) {
            System.out.println(b + " " + c + "" + a);
        } else if (c > a && a > b) {
            System.out.println(b + " " + a + "" + c);
        } else if (c > b && a > c) {
            System.out.println(c + " " + b + "" + a);
        } else if (a < c && c < b) {
            System.out.println(a + " " + c + "" + b);
        }
    }

    }
