package numbers;

import java.util.Scanner;

/*
Pascals triangle is a number triangle with numbers arranged in staggered rows.
Problem: Write a program which will print Pascal triangle up to given number. */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of rows for Pascal triangle: ");
        int rows = input.nextInt();
        input.close();
        System.out.println("Pascal triagle of " + rows + "rows:");
        for (int i = 0; i < rows; i++) {
            int number  =1;
            System.out.format("%" + (rows-1)*2 + "s", "");
            for (int j = 0; j <=i; j++) {
                System.out.format("%4d", number);
                number = number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
