package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void SortExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("i["+i+"]= ");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Exercise4.SortExample();
    }
}
