package advance;

/*Problem: Write a program which will print the longest string of given strings recursion.
Example: abc defg hi => defg*/

import java.util.Scanner;

public class FindTheLongestStringUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        input.close();

        System.out.println("The longest string: " +  longest(string));
    }
    private static String longest(String string){
        int numb = string.indexOf(" ");
        if(numb<1)
            return string;
        if (string.substring(0, numb).length()>=(longest(string.substring(numb+1)).length())){
            return longest(string.substring(0, numb));
        }
        return longest(string.substring(numb+1));
    }

}
