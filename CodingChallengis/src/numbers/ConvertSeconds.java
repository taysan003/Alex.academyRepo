package numbers;
/*

Problem: Write a program which accepts a number of seconds and converts it to hours, minute and seconds.
Example: 34567=> 09:36:07
*/

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        input.close();

        int houres = seconds/3600;
        int minutes = (seconds%3600)/60;
        int sec = seconds%60;

        System.out.println(String.format("%02d:%02d:%02d", houres, minutes, sec));
    }
}
