package If_else_1_11_24;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author namhu
 */
public class LinearQuadraticEquation  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ax + b = 0");
        System.out.println("2. ax^2 + bx +c =0");
        System.out.print("Your choice ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("The equation has infinitely many solutions");
            } else if (a == 0 && b != 0) {
                System.out.println("The equation has no solution");
            }else{
                System.out.println("The equation has a solution x = "+ -b/a);
            }
        } else if (choice == 2) {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.print("Enter c: ");
            int c = sc.nextInt();
            double denta = Math.pow(b, 2)-(4*a*c);
            if (denta < 0) {
                System.out.println("The equation has no solution");
            }else if(denta > 0){
                System.out.println("The equation has two distinct solutions: ");
                System.out.println("x1 = "+ (int)(-b+Math.sqrt(denta))/(2*a));
                System.out.println("x1 = "+ (int)(-b-Math.sqrt(denta))/(2*a));
            }else if( denta == 0){
                System.out.println("The equation has a double solution x1 = x2 = "+ -b/(2*a));
            }
        } else {
            System.out.println("Your choice is not correct ");
        }
    }
}
