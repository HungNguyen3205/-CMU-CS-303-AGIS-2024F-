package Assignment7.ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2_RemoveNumbers {
    public static void Numbers(){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> Numbers = new ArrayList<>();
        for ( int i = 1 ; i <= 10 ;i++){
            System.out.print("Enter value ["+i+"]: ");
            int num = sc.nextInt();
            Numbers.add(num);
            
        }
        System.out.println("First list: ");
        for ( Integer num : Numbers){
            System.out.print(" "+num);
        }
        Numbers.removeIf(num->num==5);
        System.out.println("");
        System.out.println("List to remove 5: ");
        for ( Integer num : Numbers){
            System.out.print(" "+num);
        }
    }
    public static void main(String[] args) {
        Exercise2_RemoveNumbers.Numbers();
    }
}
