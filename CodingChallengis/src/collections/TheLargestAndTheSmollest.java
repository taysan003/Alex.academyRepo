package collections;

/*Problem: Write a program which will find the largest and the smollest numbers in ArrayList.
Example^ 20, 10 , 30, => 30 largest, 10 - smollest*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLargestAndTheSmollest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            list.add(input.nextInt());
        }
        input.close();
        System.out.println("The largest number " + getMax( list));
        System.out.println("The smallest number " + getMin(list));
    }

    public static int getMax(List<Integer> list){
        Integer max = Integer.MIN_VALUE;

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static int getMin(List<Integer> list){
        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<min){
                min = list.get(i);
            }
        }
        return min;
    }
}
