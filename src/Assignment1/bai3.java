/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author namhu
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer number: ");
        int number = sc.nextInt();
        
        System.out.println("Input an float number: ");
        float number_float = sc.nextFloat();
        
        System.out.println("Input byte value: ");
        byte byte_value = sc.nextByte();
        
        System.out.println("Input short value: ");
        short short_value = sc.nextShort();
        
        System.out.println("Input long value: ");
        long long_value = sc.nextLong();
        
        System.out.println("Input double value: ");
        double double_value = sc.nextDouble();
        sc.nextLine();
        System.out.println("Input name: ");
        String name = sc.nextLine();
        
        System.out.println("");
        System.out.println("Number is "+ number);
        System.out.println("Float is "+ number_float);
        System.out.println("Byte value "+ byte_value);
        System.out.println("Short value "+ short_value);
        System.out.println("Long value "+ long_value);
        System.out.println("Double value "+ double_value);
        
        System.out.println("Name is "+ name);
    }
}
