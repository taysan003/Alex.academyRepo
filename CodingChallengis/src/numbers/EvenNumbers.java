package numbers;
/*Even numbers (positive or negative, not a fraction, including 0), wich is divisible by 2.
Example: -6, -2, 0, 8, 20
Problem: Print out even numbers up to given number: 10
2, 4, 6, 8, 10*/

public class EvenNumbers {
    public static void main(String[] args) {
        int max =10;
        System.out.println("Even numbers are: " );
        for (int i = 0; i <=max; i++) {
            if (i%2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
