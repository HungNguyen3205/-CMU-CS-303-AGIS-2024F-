package Assignment5.Loop1;

import java.util.Scanner;

public class Exercise2_Fibo {
    public static void Fibo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci elements you want to print: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int a = 0, b = 1;
            System.out.print("Fibonacci sequence: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }
    public static void main(String[] args) {
        Exercise2_Fibo.Fibo();
    }
}
