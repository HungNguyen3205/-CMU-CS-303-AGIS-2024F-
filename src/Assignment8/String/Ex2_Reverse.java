package Assignment8.String;

import java.util.Scanner;

public class Ex2_Reverse {
    public static void Reverse (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String words = sc.nextLine();
        StringBuffer sb = new StringBuffer(words);
        sb.reverse();
        System.out.println("The string reverse is: "+sb);
    }
    public static void main(String[] args) {
        Ex2_Reverse.Reverse();
    }
}
