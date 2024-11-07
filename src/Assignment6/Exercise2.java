package Assignment6;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {
    public static void CALCULATE(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.print("Value ["+i+"] is: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sumAverage(arr);
    } 
    public static void sumAverage(int[] arr){
        int sum = 0;
        int count = 0;
        for (int i = 0 ; i < arr.length ;i++){
            sum += arr[i];
        }
        for (int i = 0 ; i < arr.length ;i++){
            count += i;
        }
        double average = (double)sum/count;
        System.out.println("Sum: "+ sum);
        System.out.printf("Average: %.2f",average);
    }
    public static void main(String[] args) {
        Exercise2.CALCULATE();
    }
}
