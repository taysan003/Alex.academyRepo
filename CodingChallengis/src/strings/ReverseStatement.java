package strings;


import java.util.Scanner;

/*Problem: Write a program which will print the given statement in reverse.
Example: John Smith=> Smith John*/
public class ReverseStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the statement: ");
        String str = input.nextLine();

        input.close();
        String [] array  = str.split(" ");
        String reverse = "";

        for (int i = array.length-1; i >=0 ; i--) {
            reverse+= array[i];
            reverse+=" ";
        }
        System.out.println(reverse);

    }
}
