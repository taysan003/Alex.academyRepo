package advance;

import java.util.Scanner;

/*Problem: Write a program which will find the largest number of given numbers using recursion.
Example: 567873234=>567*/
public class FindLargestNumberRecursion {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String str = input.nextLine();
        input.close();
        String [] arrStr = str.split(" ");
        int [] arrInt = new int [arrStr.length];
        for (int i = 0; i <arrInt.length ; i++) {
            arrInt[i] = Integer.valueOf(arrStr[i]);
        }

        System.out.println("The largest number: " + largest(arrInt, arrInt.length-1));

    }
    private static int largest(int [] a, int index ){
        if(index>0)
            return Math.max(a[index], largest(a, index-1));
        else
            return a[0];
    }
}
