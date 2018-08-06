package collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Problem: Write a program which will find all pairs of elements whose sum is equal to a given number.
Example: 1, 2, 3:3 =>1,2*/
public class SumOfPairsInArrayList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 7, 4, 6 );
        int sum =10;

        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j <list.size()-1 ; j++) {
                if (list.get(i)+list.get(j)==sum){
                    System.out.println("Sum of "+ list.get(i)+ " and "+ list.get(j)+ " return the sum " + sum);
                }
            }
        }
    }
}