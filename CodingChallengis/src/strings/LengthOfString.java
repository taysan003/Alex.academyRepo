package strings;

/*Problem: wrute a program which will print the length of the given string without using length() method.
Example: abcdef =>6*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        input.close();

        /*System.out.println(st.length());
        System.out.println(st.lastIndexOf(""));
        System.out.println(st.toCharArray().length);
        System.out.println(st.split("").length);*/

        System.out.println("Length " + length(st));

    }
   /* public static int length( String st){
        Matcher matcher = Pattern.compile("$").matcher(st);
        matcher.find();
        int length = matcher.end();

        return  length;
    }
*/    public static int length( String st) {
       int count = 0;
       try {
           while (true) {
               st.charAt(count);
               count++;
           }
       } catch (IndexOutOfBoundsException e) {
           return count;
       }
   }

    /*public static int length( String st){
        String regex = "(?s)";
        int lenth =0;
        while (!st.matches(regex)){
        regex+=".";
        ++lenth;
        }
        return lenth;
    }
*/
    }

