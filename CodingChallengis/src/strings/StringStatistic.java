package strings;

import java.util.Scanner;
/*

Defenition: Vowels: a, e, i, o, u, y; Consonats: b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, z, x,;
Special Chars: 32
Example: abc def => vowels: 2; consonents:4; special chars:0; digits: 0; spaces:1
Problem: Write a program which will count vowels, consonats, SP, digits, and spaces of the given string.
*/

public class StringStatistic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tha sentence: ");
        String string = input.nextLine();
        input.close();

        System.out.println("This sentences consists of "+ voweles(string)+ " vovels, "+ consonants(string) +
                " consonats, " + specialChars(string)+ " special charecters "+ digits(string)+  " digits "+
                space(string)+  " spaces.");
    }

/* public static int voveles (String string){
        int number  = string.toLowerCase().length() - string.toLowerCase().replaceAll("a | e | i | o | u| y", "").length();
        return number;
    }
    public static int consonants (String string){
        int number  = string.toLowerCase().replaceAll("a | e | i | o | u| y", "").length();
        return number;
    }
    */

    static char [] vowel = {'a', 'e', 'i', 'o', 'u', 'y'};
    static char [] consonant= {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'z', 'x'};
    static char [] specialChar = {'~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '[', ']', '{', '}', '|', '<','>'};


    public static boolean containes(char ch, char[] array){
        for (char c: array) {
            if (c==ch)
                return true;
        }
        return false;
    }

    public static int voweles(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if(containes(string.toLowerCase().charAt(i), vowel)){
                count++;
            }
        }
        return count;
    }

    public static int consonants(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if(containes(string.toLowerCase().charAt(i), consonant)){
                count++;
            }
        }
        return count;
    }

    public static int specialChars(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if(containes(string.toLowerCase().charAt(i), specialChar)){
                count++;
            }
        }
        return count;
    }

    public static int space(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.toLowerCase().charAt(i);
            if(c ==' '){
                count++;
            }

            }
            return count;
        }

        public static int digits(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.toLowerCase().charAt(i);
            if('0'<=c&&c <='9'){
                count++;
            }

            }
            return count;
        }




}
