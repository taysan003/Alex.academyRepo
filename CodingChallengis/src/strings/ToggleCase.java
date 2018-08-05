package strings;


import java.util.Scanner;

/*Write a program which will toggle between uppercase and lowercase of a given string.
Example: Abcdef = aBCDEF*/
public class ToggleCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sentence = input.nextLine();
        input.close();
/*        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());*/

        String str = "";
        for (int i = 0; i <sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            if (65<=ch&&ch<=90){
              ch=(char)(ch+32);
            } else if(97<=ch&&ch<=120){
                ch = (char)(ch-32);
            }
            str+=ch;
        }
        System.out.println(str);



    }
}
