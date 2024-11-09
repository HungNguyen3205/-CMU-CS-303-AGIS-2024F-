package Assignment7.ArraysList;


import java.util.ArrayList;
import java.util.Scanner;

public class Test_ArraysList {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        for (int i  = 0 ; i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        for (String color: colors){
            System.out.println(color);
        }
    }
}
