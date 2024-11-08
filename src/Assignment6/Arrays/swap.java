package Assignment6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void Swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr numbers: ");
        int Emplenment = sc.nextInt();
        int[] numbers = new int[Emplenment];
        for (int i = 0; i<numbers.length;i++){
            System.out.println("Numbers at ["+i+"]= ");
            numbers[i] = sc.nextInt();
        }
        for ( int i =0 ; i<numbers.length/2 ; i++){
            int temp = numbers[i];
            numbers[i]= numbers[numbers.length -1 -i];
            numbers[numbers.length - 1 - i]= temp;
        }
        System.out.print(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        swap.Swap();
    }
}
