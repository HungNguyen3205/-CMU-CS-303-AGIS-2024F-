package Assignment4.Loop;

public class Exercise1_SumOddEven {

    public static void Sum_odd_even() {
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum_odd += i;
            } else {
                sum_even += i;
            }
        }
        System.out.println("Sum odd " + sum_odd);
        System.out.println("Sum even " + sum_even);
    }

    public static void Odd() {
        System.out.print("Show odd numbers: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void Even() {
        System.out.println(" ");
        System.out.print("Show even numbers: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
    
    public static void main(String[] args) {
        Exercise1_SumOddEven.Sum_odd_even();
        Exercise1_SumOddEven.Odd();
        Exercise1_SumOddEven.Even();
    }
}
