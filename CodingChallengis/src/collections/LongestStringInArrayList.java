package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a program which will print the longest element in ArrayList
Example: [a, bb, ccc] =>ccc*/
public class LongestStringInArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String text = "";
        String logestString = "";
        int lengthMax = 0;
        while (!text.equals("stop")){
            text= input.nextLine();
            list.add(text);
        }

        for (String str: list) {
           if(str.length()>lengthMax){
               lengthMax= str.length();
               logestString = str;
           }

        }
        System.out.println("The longest string is : " + logestString);
    }
}
