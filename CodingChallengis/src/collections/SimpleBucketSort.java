package collections;

/*Defenition: Bucket sort is a comparsion sort algorithm that operates on elements by dividing them
into different buckets and then sorting these buckets individually.
Each bucket is sorted individually using a separate sorting algorithm.
Problem: Write a program which acceptes a numbers and sort them in ascending order. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimpleBucketSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }
        input.close();

        int index = 0;
        Integer[] array = list.toArray(new Integer[list.size()]);
        int max = maxValue(array);
        int[] bucket = new int[max + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }
        //00000000000000000000000000000000000000
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[index++] = i;
            }
        }
        //00000001000000000001000000000100000000
        list = Arrays.asList(array);
        System.out.println("Sorted numbers ");

    }

    private static int maxValue(Integer[] a) {
        int maxValue = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }

        }
        return maxValue;
    }


}
