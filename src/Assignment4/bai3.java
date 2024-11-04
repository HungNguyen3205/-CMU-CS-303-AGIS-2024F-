package Assignment4;

public class bai3 {

    public static boolean isPrime(int n){
        if ( n <= 1 ){
            return false;
        }else if(n==2){
            return true;
        }else if(n%2==0){
            return false;
        }
        for(int i = 3; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void Prime_numbers() {
        System.out.print("The prime numbers is: ");
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        bai3.Prime_numbers();
    }
}
