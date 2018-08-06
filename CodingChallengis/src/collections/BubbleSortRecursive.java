package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Problem: Write a program which accepts a numbers and sort them in ascending order. */
public class BubbleSortRecursive {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        while (input.hasNextInt()){
            int number = input.nextInt();
            list.add(number);
        }
        input.close();
        bubbleSort(list, 0, list.size()-1);
        System.out.println(list);

    }
    private static void bubbleSort(List<Integer> list, int a, int b){
        if(a<b&&b>0){
            if(list.get(a).compareTo(list.get(a+1))>0){
                Integer swap = list.get(a);
                list.set(a, list.get(a+1));
                list.set(a+1, swap);

            }
            bubbleSort( list, a+1, b );
            bubbleSort( list, a, b-1 );
        }else
            return;
    }
}
