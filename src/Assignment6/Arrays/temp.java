package Assignment6.Arrays;

import java.util.Scanner;

public class temp {

    public static void temperatures() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temperatures: ");
        int day = sc.nextInt();
        int[] temp = new int [day];
        int sum = 0;
        for ( int i = 0 ; i< day; i++){
            System.out.println("Day"+(i+1)+"'s high temp: ");
            temp[i] = sc.nextInt();
            sum+=temp[i];
        }
        double average = (double)sum/day;
        int count =0;
        for  ( int i = 0 ; i< day; i++){
            if ( temp[i] > average){
                count++;
            }
        }
        System.out.printf("Average temp = %.2f", average);
        System.out.println("");
        System.out.println(count+ " days above average");
    }

    public static void main(String[] args) {
        temp.temperatures();
    }
}
