package strings;
/*
Defenition: Permutation is the action of changing the arrangement of a characters.
Problem: Write a program which will print all permutations of a string.
Example: abc=> abc, acb, bac, bca, cab, cba*/

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        input.close();
        char[] chars = string.toCharArray();

        int number = chars.length;
        int[] array = new int[number];
        int item  =0;
        for (int i = 0; i <Math.pow(number, number) ; i++) {
            item =0;
            while (item<number){
                System.out.print(chars[array[item]]+"");
                item++;

            }
            System.out.print(", ");
            item=0;
            while (item<number){
                if(array[item]<number-1){
                    array[item]++;
                    break;
                }else {
                    array[item]=0;}
                    item++;
                }
            }
        }
    }


