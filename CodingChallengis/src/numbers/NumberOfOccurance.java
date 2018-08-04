package numbers;

import java.util.Scanner;

/*Write a program which accepts a list of numbers and then the number to be searched and find out
the number of occurence.
Example: 112321:1=>3*/
public class NumberOfOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the number for searching: ");
        int serNumber = input.nextInt();
        input.close();

        String n = String.valueOf(number);
        String sn = String.valueOf(serNumber);
        /*int count = n.length() - n.replace(sn, "").length();*/
        int count =0;
        for (int i = 0; i <n.length(); i++) {
            if(n.charAt(i)==sn.charAt(0)){
                count++;
            }

        }
        System.out.println("Number occurences "+ sn + " in number " +n+ " equlse "+ count );
    }
}
