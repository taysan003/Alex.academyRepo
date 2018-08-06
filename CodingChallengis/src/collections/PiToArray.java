package collections;
/*Problem: Write a programm which will print an int array length 3 containing first 3 digits of Pi: 314
Example: 31415926535*/

public class PiToArray {

    public static void main(String[] args) {
        setPi();
        getPi(3);
    }

    public static  double pi = Math.PI;
    public  static String [] str = String.valueOf(pi).replaceAll("\\.", "").split("");
    public static int [] array = new int [str.length];

    public static void setPi(){
        for (int i = 0; i <str.length; i++) {
            array[i] = Integer.parseInt(str[i]);

        }
    }

    public static void getPi(int x){
        for (int i = 0; i <x ; i++) {
            System.out.print(array[i]);
        }
    }
}
