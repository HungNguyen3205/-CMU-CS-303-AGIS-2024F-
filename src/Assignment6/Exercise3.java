package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void COunt() {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter value you want to count: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value [" + i + "]= ");
            arr[i] = sc.nextInt();
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The value you choose appears in the loop " + count + " times");

    }

    public static void main(String[] args) {
        Exercise3.COunt();
    }
}
