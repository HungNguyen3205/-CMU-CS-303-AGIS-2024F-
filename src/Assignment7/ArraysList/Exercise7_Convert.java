package Assignment7.ArraysList;

import java.util.ArrayList;

public class Exercise7_Convert {
    public static void Convert (){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Integer[] array = new Integer[numbers.size()];
        array = numbers.toArray(array);
        for (Integer num : array) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Exercise7_Convert.Convert();
    }
}
