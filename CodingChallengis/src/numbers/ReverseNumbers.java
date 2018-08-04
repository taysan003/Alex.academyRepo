package numbers;

/*Problem: Write a program which accepts a number and prints its reverse number
Example: 12345=>54321*/
public class ReverseNumbers {
    public static void main(String[] args) {

        /*int number = 12345;
        int reverse = number;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        stringBuffer.reverse();
        int reversedNumber = Integer.parseInt(stringBuffer.toString());
        System.out.println(reversedNumber);*/

        /*int number = 12345;
        int reverse = 0;
        while (number!=0){
            reverse = reverse*10;
            reverse = reverse + number%10;
            number /= 10;
        }
        System.out.println(reverse);*/

        int number = 12345;
        String reverse = "";
        String str = String.valueOf(number);
        for (int i = str.length()-1; i >=0 ; i--) {
                reverse = reverse + str.charAt(i);
        }
        int rev = Integer.parseInt(reverse);
        System.out.println(rev);
    }

}
