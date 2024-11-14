package Assignment8.String;

import java.util.Scanner;

public class Ex5_Split {
    public static void Split (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        System.out.println("Word array: ");
        for (String word : words){
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        Ex5_Split.Split();
    }
}
