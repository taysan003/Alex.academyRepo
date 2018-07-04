package numbers;
/*
Leap year is containing 366 day (February 29), divisible by 4 and 400, but not by 100. October 15, 1582
Example: 2000=>leap year
Problem: Write a program which will check the given year is leap or not.
*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if (String.valueOf(number).length()!=4){
            System.out.println("Year is not leap");
            System.exit(0);
        }
        if ((number>1582)&&(number%4==0)&&(number%100!=0)|| (number%400==0)){
            System.out.println(number + " Leap Year");
        }else {
            System.out.println("Year is not leap");
        }
    }
}
