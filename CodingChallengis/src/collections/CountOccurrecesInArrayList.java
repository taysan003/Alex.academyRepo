package collections;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Problem: Write a program which will count the number of occurrences of an alement in ArrayList.
Christina
Nikita
Chrisitia
Chrisitia
Chrisitia: 3
Nikita: 1*/
public class CountOccurrecesInArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Enter elements: ");
        Scanner input = new Scanner(System.in);
        String text = "";
        while(!text.equals("stop")){
            text = input.nextLine();
            list.add(text);
        }
        input.close();
        List<String> list_out = new ArrayList<>();
        for (String str: list) {
            int count =0;
            for (int i = 0; i <list.size() ; i++) {
                Pattern p = Pattern.compile(list.get(i));
                Matcher matcher = p.matcher(str);
                 while (matcher.find()){
                     count++;}
                     list_out.add(count +" : "+ str);
            }
        }
                Set<String> set = new TreeSet<>(list_out);
        set = ((TreeSet<String>) set).descendingSet();//Reverse order
                for (String s: set) {
                    System.out.println(s);
                }
            }

        }




