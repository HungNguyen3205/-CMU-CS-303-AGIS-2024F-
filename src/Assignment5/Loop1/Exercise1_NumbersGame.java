package Assignment5.Loop1;

import java.util.Random;
import java.util.Scanner;

public class Exercise1_NumbersGame {

    public static void program() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(50);
        System.out.println("Enter your number you think it true");
        int num = sc.nextInt();
        int ran_number = random.nextInt(50) + 1;
        System.out.println(ran_number);
        while (num != ran_number) {
            if (num < ran_number) {
                System.out.println("Your number is lower.");
            } else {
                System.out.println("Your number is higher");
            }
            System.out.println("Enter again");
            num = sc.nextInt();
        }
        System.out.println("You are correct");
    }

    public static void main(String[] args) {
        Exercise1_NumbersGame.program();
    }
}
