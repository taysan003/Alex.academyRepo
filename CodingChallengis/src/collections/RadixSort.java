package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Defenition: Radix is the base of a system of numeration. Radix sorting algorithm that sorts data with integer keys by grouping keys by
the individual digits which share the same significant position and value.
Problem: Write a program which accepts a number and sort them in ascending order. */
public class RadixSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter series of numbers: ");
        Scanner input  = new Scanner(System.in);
        while (input.hasNextInt()){
            list.add(input.nextInt());
        }
        input.close();

        Integer[] list_as_array = list.toArray(new Integer[list.size()]);
        radixsort(list_as_array);
        List<Integer> list_out = Arrays.asList(list_as_array);
        System.out.print(list_out);
    }
    private static void radixsort(Integer[] input){
        List<Integer>[] buckets = new ArrayList[10];
        for(int i =0; i<buckets.length; i++ ){
            buckets[i] = new ArrayList<Integer>();
        }
        boolean flag = false; //Sorting
        int tmp = -1, divisor =1;
        while (!flag){
            flag = true;
            for (Integer i: input) { //Split input between
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
                int a =0;                    //Empty lists into input array
                for (int b = 0; b <10 ; b++) {
                    for (Integer i : buckets[b]){
                        input[a++] =i;}
                        buckets[b].clear();
                    }
                    divisor*=10;
                }
            }


}
