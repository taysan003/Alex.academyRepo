package collections;

/*Problem: Write a program which accepts numbers and sort them in ascending order. */
/*корманная, блочная сортировка*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BucketSort {
    public static void main(String[] args) {
        int bucketCount =10;
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter series of numbers: ");
        Scanner input =new Scanner(System.in);
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        input.close();

        Integer[] array  = list.toArray(new Integer[list.size()]);
        bucketSort(array, bucketCount);
        List<Integer> list_out = Arrays.asList(array);
        System.out.println("Sorted numbers: "+ list_out);
    }

    private static Integer[] bucketSort(Integer[] array, int bucketCount){
        if(bucketCount<=0) throw new IllegalArgumentException("Invalid bucket count");
        if(array.length<=1)
            return array;

        int high = array[0];
        int low = array[0];

        //Find the range  of input elements
        for (int i = 0; i <array.length ; i++) {
            if(array[i]> high)
                high = array[i];
            if (array[i]<low)
                low = array[i];
        }
        //Range of one bucket
        double interval  = ((double)(high - low+1))/bucketCount;

        ArrayList<Integer> buckets[]  = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount ; i++) {
            buckets[i] = new ArrayList<>();
        }

        //Partition the input array.
        int index =0;
        for (int i = 0; i <array.length ; i++) {
            buckets[(int)((array[i] - low ) / interval)].add(array[i]);

        }

        for (int i = 0; i <buckets.length ; i++) {
            for (int j = 0; j <buckets[i].size() ; j++) {
                array[index]=buckets[i].get(j);
                index++;
            }
        }
      return array;
    }


}
