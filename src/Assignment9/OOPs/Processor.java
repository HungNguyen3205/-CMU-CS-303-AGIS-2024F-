package Assignment9.OOPs;

import java.util.Scanner;

public class Processor {

    public static void Option() {
        Student_List studentlist = new Student_List();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\n Menu: ");
            System.out.println("1. Enter information student ");
            System.out.println("2. Show list student");
            System.out.println("3. Add student");
            System.out.println("4. Delete student");
            System.out.println("5. Edit student");
            System.out.println("6. Exit");
            System.out.print("Enter the number: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1 -> {
                    System.out.println("Enter the number of students to enter:");
                    int n = sc.nextInt();
                    sc.nextLine(); 
                    for (int i = 0; i < n; i++) {
                        studentlist.addStudent();
                    }
                }
                case 2 -> {
                    studentlist.displayStudent();
                }
                case 3 -> {
                    studentlist.addStudent();
                }
                case 4 -> {
                    studentlist.deleteStudent();
                }
                case 5 -> {
                    studentlist.editStudent();
                }
                case 6 -> {
                    System.out.println("Exit complete");
                    break;
                }
                default -> {
                    System.out.println("Your option is not correct");
                }
            }
        } while (choose != 6); 
    }

    public static void main(String[] args) {
        Processor.Option();
    }
}
