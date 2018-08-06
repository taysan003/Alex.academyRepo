package collections;

/*Problem: Write a program which acceptes a number and sort them in ascending order.
Example: 10, 4, 25 => 4 10 25*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbersInArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        while (input.hasNextInt()){
            list.add(input.nextInt());
        }
        input.close();
        Collections.sort(list);
        System.out.println(list);
    }

}
