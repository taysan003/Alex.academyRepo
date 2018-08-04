package numbers;

/*
Problem: Write a program which takes a number and converts it into string.
Example: 54=>fifty four
*/

import java.util.Scanner;

public class NumbersToStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        System.out.println(convert(number));

    }
    final private static String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                                            "nine", "ten", "eleven", "twelve", "thirteen", "fifteen", "sixteen",
                                            "seventeen", "eighteen", "ninteen"};
    final private static String [] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "sevety", "eighty",
                                            "ninety"};

    public static String convert (long number) {
        if(number<20) {
            return  units[(int) number];}

        if (number<100){
            return tens[(int)(number/10)]+
                    ((number%10>0)? " " + convert(number%10) : "");
        }
        if (number<1000){
            return units[(int)(number/100)]+ "hundred"+
                    ((number%100>0)? "and" + convert(number%100) : "");
        }
        if (number<1000000){
            return convert(number/1000)+ "thousand"+
                    ((number%1000>0)? "" + convert(number%1000) : "");
        }
        if (number<100000000){
            return convert(number/1000000)+ "million"+
                    ((number%1000000>0)? "" + convert(number%1000000) : "");
        }
        else
            return convert(number/1000000000)+ "billion"+
                ((number%1000000000>0)? "" + convert(number%1000000000) : "");
    }

}
