package numbers;

/*Example: 1*9 + 2*6+ 3*3 =30 | 1*8+2*5+3*2 =24 | 1*7+2*4+3*1=18
         4*9 + 5*6 +6*3 =84 | 4*8+5*5+6*2 =69 | 4*7+5*4+6*1=54
         7*9 + 8*6 +9*3=138 | 7*8+8*5+9*2=114 | 7*7+8*4+9*1

                1 2 3            9 8 7           30 24 18
                4 5 6       *    6 5 4      =    84 69 54
                7 8 9            3 2 1           138 114 90
Problem: Write a program to take 2 matrix [3][3] arrays as inputs and calculate the multiplication of both matrix.*/

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int array1 [][] = new int [3][3];
        int array2 [][] = new int [3][3];
        int array3 [][] = new int [3][3];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter array1 row " + (i+1)+ ": ");
            for (int j = 0; j <3 ; j++) {
                array1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter array2 row " + (i+1)+ ": ");
            for (int j = 0; j <3 ; j++) {
                array2[i][j] = input.nextInt();
            }
        }
        input.close();

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                for (int k = 0; k <3 ; k++) {

                    array3[i][j] = array3[i][j] + array1[i][k]*array2[k][j];
                }

            }
        }

        System.out.println("Multiplication of matrix ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(array3[i][j]+ " ");


            }
            System.out.println();
        }


    }
}
