package Assignment7.ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise6_SortAscending {

    public static void Sort_Ascending() {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(5);
        Numbers.add(3);
        Numbers.add(8);
        Numbers.add(2);
        Numbers.add(4);
        System.out.println(Numbers);
        Collections.sort(Numbers);
        System.out.println(Numbers);
    }

    public static void main(String[] args) {
        Exercise6_SortAscending.Sort_Ascending();
    }
}
