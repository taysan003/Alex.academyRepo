package collections;

/*

Problem: Write a program which accepts a numbers and sort them a ascending order.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int numbers =0;
        while (input.hasNextInt()){
            numbers = input.nextInt();
            list.add(numbers);
        }
        input.close();

        for (int index = 0; index <list.size()-1 ; index++) {
            for (int i = 0; i <list.size()-1 ; i++) {
                if (list.get(i).compareTo(list.get(i+1))>0){
                    if ((list.get(i))>list.get(i+1)){
                        Integer swap = list.get(i);
                        list.set(i, list.get(i+1));
                        list.set(i+1, swap);

                    }
                }
            }
        }
        System.out.println(list);
    }

}
