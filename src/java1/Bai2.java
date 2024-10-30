package java1;

import java.util.Scanner;


public class Bai2 {
    
//    public static void main(String[] args) {
//        String studentID = "123456789";
//        System.out.println("StudentID= "+ studentID);
//    }
    
//      public static void main(String[] args) {
//        double myGPA = 10 + 2.25;
//          System.out.println(myGPA);
//    }
      
      public static void main(String[] args) {
        int x = 1;
//        int y = x++ + ++x + x + x++ + x++ + ++x;
        int z = x++ + --x + x + x-- + x++ + --x;
          System.out.println(z);
          System.out.println(x);
          
    }
}
