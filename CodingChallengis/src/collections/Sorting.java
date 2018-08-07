package collections;

/*Defenition: Counting sort is a sorting technique based on keys between a specific range.
It works by counting the number of objects having distinct kay values.
Problem: Write a program which accepts a number and sort them in ascending order.  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            list.add(input.nextInt());
        }
        input.close();
        Integer[] list_as_array = list.toArray(new Integer[list.size()]);
        List<Integer> list_out  = Arrays.asList(countigsort(list_as_array));

        System.out.println(list_out);
    }
    private static Integer[] countigsort (Integer[] input) {
        Integer[] buckets = new Integer[input.length];
        //Smallest and the largest value
        int min = input[0];
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            } else if (input[i] > max) {
                max = input[i];
            }
            //Array of freaquencies
            int[] counts = new int[max - min + 1];
            //Frequence initialization
            for (int i = 0; i < input.length; i++) {
                counts[input[i] - min]++;
            }

            //Array of occurrences
            counts[0]--;
            for (int i = 1; i < counts.length; i++) {
                counts[i] = counts[i] + counts[i - 1];
            }

            for (int i = input.length - 1; i >= 0; i--) {
                buckets[counts[input[i] - min]--] = input[i];
            }
            return buckets;
        }

    }
}
