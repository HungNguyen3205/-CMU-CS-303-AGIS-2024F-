package Assignment5;

import java.util.Scanner;

public class Exercise4 {
    public static void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i<= n;i++ ){
            for (int j = 1; j<= i ; j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Exercise4.pyramid();
    }
}