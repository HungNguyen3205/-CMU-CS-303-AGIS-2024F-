package Assignment5.Loop1;

public class Exercise3_MultiplicationTable {
    public static void theMultiplicationTable(){
        for ( int i = 0; i<=10; i++){
            for ( int j = 0; j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Exercise3_MultiplicationTable.theMultiplicationTable();
    }
}
