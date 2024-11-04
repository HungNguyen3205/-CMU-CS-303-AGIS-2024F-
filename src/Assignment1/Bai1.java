package Assignment1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author namhu
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        System.out.println("Name: Nguyễn Nam Hùng ");
//        System.out.println("Class: TPM16");
//        System.out.println("MSSV: 29219021557");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = sc.nextLine();

        System.out.println("Input class");
        String your_class = sc.nextLine();

        System.out.println("Input sex");
        String sex = sc.nextLine();

        System.out.println("Input studient code:");
        int code = sc.nextInt();

        System.out.println("Hi fen " + name);
        System.out.println("Your class is " + your_class);
        System.out.println("Your code is " + code);
        System.out.println("Your sex " + sex);
    }
}
