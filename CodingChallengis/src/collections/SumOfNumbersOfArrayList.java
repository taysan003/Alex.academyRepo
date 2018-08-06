package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Problem: Write a program which will display the of the elements of an ArrayList.
Example: 1, 2, 3 => 6*/
public class SumOfNumbersOfArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        Scanner input =new Scanner(System.in);
        int sum = 0;
        while (input.hasNextInt()){
            list.add(input.nextInt());

        }
        input.close();

        for (int i: list) {
            sum+=i;
        }
        System.out.println(sum);
    }

}
