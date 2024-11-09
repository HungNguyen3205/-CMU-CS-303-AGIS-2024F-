package Assignment7.ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5_UpdateElement {
    public static void Update(){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> Up = new ArrayList<>();
        for (int i = 0 ; i <= 5 ; i++){
            System.out.print("Enter value of i["+i+"]= ");
            int num = sc.nextInt();
            Up.add(num);
        }
        for (Integer num: Up){
            System.out.print(" "+num);
        }
        System.out.println("");
        System.out.println("Update the 3rd element to 100 and print the list.");
        Up.set(3,100);
        for (Integer num: Up){
            System.out.print(" "+num);
        }
    }
    public static void main(String[] args) {
        Exercise5_UpdateElement.Update();
    }
}
