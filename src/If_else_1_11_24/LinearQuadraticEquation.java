package If_else_1_11_24;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author namhu
 */
public class LinearQuadraticEquation {

    public static void main(String[] args) {
        //Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ax + b = 0");
        System.out.println("2. ax^2 + bx +c =0");
        //Nhập lựa chọn
        System.out.print("Your choice ");
        int choice = sc.nextInt();
        //Nếu là 1 chạy phương trình bậc nhất
        if (choice == 1) {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            //Nếu a = 0, b = 0 thì cho ra Phương trình có vô số nghiệm
            if (a == 0 && b == 0) {
                System.out.println("The equation has infinitely many solutions");
            }//Nếu a = 0, b != 0 thì in ra phương trình vô nghiệm 
            else if (a == 0 && b != 0) {
                System.out.println("The equation has no solution");
            }//Còn lại thì in ra kết quả 
            else {
                System.out.println("The equation has a solution x = " + -b / a);
            }
            //Nếu là 2 thì chạy phương trình bậc 2
        } else if (choice == 2) {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.print("Enter c: ");
            int c = sc.nextInt();
            //Tính denta
            //Math.pow() dùng để tính số mũ
            //Math.sqrt() dùng để tính căn bậc 2
            double denta = Math.pow(b, 2) - (4 * a * c);
            //Nếu denta bé hơn 0 thì in ra Phương trình vô nghiệm
            if (denta < 0) {
                System.out.println("The equation has no solution");
            } //Nếu denta lớn hơn 0 thì in ra Phương trình có 2 nghiệm phân biệt rồi cho ra kết quả x1 x2
            else if (denta > 0) {
                System.out.println("The equation has two distinct solutions: ");
                System.out.println("x1 = " + (int) (-b + Math.sqrt(denta)) / (2 * a));
                System.out.println("x1 = " + (int) (-b - Math.sqrt(denta)) / (2 * a));
            } //Nếu denta bằng 0 thì in ra Phương trình có nghiệm kép x1 = x2 rồi in ra kết quả 
            else if (denta == 0) {
                System.out.println("The equation has a double solution x1 = x2 = " + -b / (2 * a));
            }
        } //Nếu không phải 1 hoặc 2 thì hiển thị thông báo lỗi 
        else {
            System.out.println("Your choice is not correct ");
        }
    }
}
