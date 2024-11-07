package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void minMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    } 
    public static void Print(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("i["+i+"]= ");
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        minMax(arr);
    }
    public static void main(String[] args) {
        Exercise1.Print();
    }
}
