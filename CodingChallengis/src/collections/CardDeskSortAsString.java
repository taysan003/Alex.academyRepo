package collections;

/*Example: Kings, Ace, Queen, Jack, 10, 9, 7, 8, 2, 4, 3, 5, 6
Problem: Write a program which will sort a deck of card by rank (from list of Strings)*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardDeskSortAsString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kings", "Ace", "Queen", "Jack", "10", "9", "7", "8", "2", "4", "3", "5", "6");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, deck);
        System.out.println(list);
    }
    private static Comparator<String> deck = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if((o1=="9" || o1=="7"|| o1=="8"|| o1=="2"|| o1=="4"|| o1=="3"|| o1=="5"|| o1=="6")&&o2=="10")
                return -1;
            if((o1=="Kings" || o1=="Queen" || o1=="Jack")&&o2=="Ace")
                return -1;
            if((o1=="Queen" || o1=="Jack")&&o2=="Kings")
                return -1;
            else
            return 0;
        }

    };


}
