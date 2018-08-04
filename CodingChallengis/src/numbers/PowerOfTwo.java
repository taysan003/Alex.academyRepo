package numbers;

import java.util.Scanner;
/*For example for 4 ( 100) and 16(10000), we get following after subtracting 1
        3 –> 011
        15 –> 01111

        So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero. We can say n is a power of 2 or not based on value of n&(n-1). The expression n&(n-1) will not work when n is 0. To handle this case also, our expression will become n& (!n&(n-1)) (thanks to https://www.geeksforgeeks.org/program-to-find-whether-a-no-is-power-of-two/Mohammad for adding this case).
        Below is the implementation of this method.

Power of two numbers: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096,
Problem: write a program which will check the given number is power of two or not*/

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        input.close();

        System.out.println(number + " is " + (isPowerOfTwo(number) ? "Power of Two": "Not power of two"));



    }
    public static  boolean isPowerOfTwo(int number){
        return (number!=0) &&((number&(number-1))==0);
    }

   /* Run on IDE
2. Another solution is to keep dividing the number by two, i.e, do n = n/2 iteratively.
    In any iteration, if n%2 becomes non-zero and n is not 1 then n is not a power of 2.
    If n becomes 1 then it is a power of 2.

    class GFG {

        // Function to check if
        // x is power of 2
        static boolean isPowerOfTwo(int n)
        {
            if (n == 0)
                return false;

            while (n != 1)
            {
                if (n % 2 != 0)
                    return false;
                n = n / 2;
            }
            return true;
        }

        // Driver program
        public static void main(String args[])
        {
            if (isPowerOfTwo(31))
                System.out.println("Yes");
            else
                System.out.println("No");

            if (isPowerOfTwo(64))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }*/
}
