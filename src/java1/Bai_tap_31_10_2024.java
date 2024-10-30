/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author namhu
 */
public class Bai_tap_31_10_2024 {
    
    //Bai 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = sc.nextLine();

        System.out.print("Input age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Input sex: ");
        String sex = sc.nextLine();

        System.out.print("Input major: ");
        String major = sc.nextLine();

        System.out.print("Input GPA: ");
        float gpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Input hometown: ");
        String hometown = sc.nextLine();

        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Hometown: " + hometown);
    }
    
    
    //Bai 1.1
//    public static void main(String[] args) throws ParseException{
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Input name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Input age: ");
//        int age = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Enter date of birth (dd/MM/yyyy): ");
//        String date = sc.nextLine();
//
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        format.setLenient(false);
//        Date date1 = format.parse(date);
//
//        System.out.print("Input sex: ");
//        String sex = sc.nextLine();
//
//        System.out.print("Input major: ");
//        String major = sc.nextLine();
//
//        System.out.print("Input GPA: ");
//        float gpa = sc.nextFloat();
//        sc.nextLine();
//
//        System.out.print("Input hometown: ");
//        String hometown = sc.nextLine();
//
//        System.out.println("");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Date of Birth: " + format.format(date1));
//        System.out.println("Sex: " + sex);
//        System.out.println("Major: " + major);
//        System.out.println("GPA: " + gpa);
//        System.out.println("Hometown: " + hometown);
//    }

    //Bai2
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the string of numbers here that you want to check is correct or not");
//        System.out.println("String data type? "+ sc.hasNext());
//    }
    //Bai3
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Check whether the value entered on the keyboard is an integer or not");
//        System.out.println("String data type? "+ sc.hasNextInt());
//    }
}
