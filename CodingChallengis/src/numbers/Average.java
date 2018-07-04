package numbers;

import java.util.Scanner;

/*Average
Example: 2, 5, 9 =>8
Problem: Write a program which takes "X" amount of numbers (positive and negative) and find out the average of positive and negative numbers.*/
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount of numbers: ");
        int amount = input.nextInt();
        int[] numbers = new int [amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number # " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }
        input.close();
        int pos_count, neg_count, positive, negative;
        double avg_pos = 0;
        double avg_neg = 0;
        pos_count = neg_count = positive = negative =0;
        for (int number : numbers) {
            if(number>0){
                positive+=number;
                pos_count++;
            }else {
                negative +=number;
                neg_count++;
            }
        }
        avg_pos = (double) positive / pos_count;
        avg_neg = (double) negative / neg_count;

        System.out.println("Positive  average: "+ avg_pos);
        System.out.println("Negative  average: "+ avg_neg);
    }
}
