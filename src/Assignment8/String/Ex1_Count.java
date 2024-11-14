package Assignment8.String;

import java.util.Scanner;

public class Ex1_Count {
    public static void Count (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String words = sc.nextLine();
        System.out.println("Enter the specific character:  ");
        char x = sc.nextLine().charAt(0);
        int count =0 ;
        for ( int i = 0 ; i < words.length(); i++){
            if(words.charAt(i)==x){
                count++;
            }
        }
        System.out.println("'"+ x +"' repeated "+count+" times");
    }
    public static void main(String[] args) {
        Ex1_Count.Count();
    }
}
