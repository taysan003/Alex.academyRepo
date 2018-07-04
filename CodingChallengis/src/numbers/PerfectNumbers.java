package numbers;

/*Pefect Numbers is a positive integer  that is equal  to the sum of its proper divisors (6 =>1+2+3)
Example: 6, 28, 496, 8128, 33_550_336

Problem: Print out perfect numbers up to given number: 10000*/

public class PerfectNumbers {
    public static void main(String[] args) {

        int max = 10000;
        for (int i = 1; i <=max; i++) {
            if (isPerfect(i)){
                System.out.print(i+ ", ");
            }
        }

    }
    public static boolean isPerfect(int number){

        int temp =0;
        for (int i = 1; i <=number/2; i++) {
            if (number %i ==0) {
                temp+=i;
            }
        }
        if (temp == number){
            return true;
        } else {
            return false;
        }

    }
}
