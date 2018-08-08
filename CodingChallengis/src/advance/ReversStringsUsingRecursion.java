package advance;

/*Problem: Write a program which will print reverse of string using recursion.
Example: abcdef=>fedcba*/

import java.util.Scanner;

public class ReversStringsUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        input.close();

        System.out.println("Reverse string "+ reverse(str));
    }

    private static String reverse(String string){
        if(string.length()<2)
            return string;
        String rever = reverse(string.substring(1))+string.charAt(0);
        

        return rever;
    }
}
