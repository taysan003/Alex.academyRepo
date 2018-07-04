package numbers;

import java.util.Scanner;

/*Collatz Sequence -if n is 1, stop; if n is even, the next number is n/2; if n is odd, the next number is n*3+1
aka: Hailstone, Kakutani, Hasse, Syracuse, 3n+1 Sequence
Example: 3: 10(3*3+1), 5(10/2), 16(5*3+1), 16(5*3+1), 8(16/2), 4, 2, 1
4: 2, 1; 5: 16, 8, 2, 1; 6: 3, 10, 5, 16, 8, 4, 2, 1;
Enter a number: 25
CS is: 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13*/
public class CollatzSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        input.close();
        String result = String.valueOf(number); // if ((number & 1)==0) => 0
        while (number>1){
            if(number%2==0){
                number = number/2;
            } else {
                number = number*3+1;
            }
            result+=" "+String.valueOf(number); // result += " "+ number; +> toString

        }
        System.out.println("Collatz Sequence is: "+ result);
    }


}
