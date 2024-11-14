package Assignment8.String;

import java.util.Scanner;

public class Ex4_Convert {
    public static void Convert (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String words = sc.nextLine();
        StringBuilder switched = new StringBuilder();
        for ( char ch : words.toCharArray()){
            if(Character.isLowerCase(ch)){
                switched.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                switched.append(Character.toLowerCase(ch));
            }else {
                switched.append(ch);
            }
        }
        System.out.println("The convert word is: "+switched.toString());
    }
    public static void main(String[] args) {
        Ex4_Convert.Convert();
    }
}
