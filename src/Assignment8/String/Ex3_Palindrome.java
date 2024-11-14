package Assignment8.String;

import java.util.Scanner;

public class Ex3_Palindrome {
    public static void Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        String sb = new StringBuffer(s).reverse().toString();
        System.out.println(sb);
        if(s.equals(sb)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Ex3_Palindrome.Palindrome();
    }
}
