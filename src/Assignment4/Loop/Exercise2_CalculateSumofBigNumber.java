package Assignment4.Loop;


package Assignment4;

import java.util.Scanner;

public class bai2 {
    public static void  Calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;   
            sum += digit;         
            n /= 10;              
        }
        System.out.println("The sum of the digits is: " + sum);
        }
    }
    public static void main(String[] args) {
        bai2.Calculate();
    }
