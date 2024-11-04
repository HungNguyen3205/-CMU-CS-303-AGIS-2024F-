package Assignment3;

import java.util.Scanner;

public class Exercise3 {
    public static void Check(){
        System.out.println("Input the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("Not a prime number");
                case 2 -> System.out.println("A prime number");
                case 3 -> System.out.println("A prime number");
                case 4 -> System.out.println("Not a prime number");
                case 5 -> System.out.println("A prime number");
                case 6 -> System.out.println("Not a prime number");
                case 7 -> System.out.println("A prime number");
                case 8 -> System.out.println("Not a prime number");
                case 9 -> System.out.println("Not a prime number");
            default -> throw new AssertionError();
        }
    }
    
    public static void main(String[] args) {
        Exercise3.Check();
    }
}
