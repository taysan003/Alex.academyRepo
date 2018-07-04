package numbers;

/*Quarter of a circle is an arc of 90.
Example: 0-89=>1;  90-179=>2; 180-269=>3; 270-359=>4
Problem: Write a program which accepts an angle and prints its quadrant.*/

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner input = new Scanner(System.in);
        int angle = input.nextInt();
        input.close();
        int quadrant;
        quadrant = (angle/90)%4+1;
        System.out.println("Angle: " + angle + " Quadrant: "+ quadrant);

    }


}
