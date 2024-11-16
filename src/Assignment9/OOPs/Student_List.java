package Assignment9.OOPs;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_List {

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> StudentList = new ArrayList<>();

    public void addStudent() {
        Student newStudent = new Student();
        newStudent.enterStudent();
        StudentList.add(newStudent);
        System.out.println("Add student complete");
    }

    public void displayStudent() {
        if (StudentList.isEmpty() != true) {
            for (Student student : StudentList) {
                student.displayStudent();
            }
        } else {
            System.out.println("No member in list student. ");
        }
    }

    public Student findIDstudent(String idToFind) {
        System.out.print("Enter ID student you want find: ");
        String idTofind = sc.nextLine();
        for (Student student : StudentList) {
            if (student.ID.equalsIgnoreCase(idTofind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent() {
        System.out.println("Enter ID student you want to delete: ");
        String idTodelete = sc.nextLine();
        for (Student student : StudentList) {
            if (student.ID.equalsIgnoreCase(idTodelete)) {
                StudentList.remove(student);
                System.out.println("Delete student complete.");
                return true;
            }
        }
        System.out.println("Delete student fail.");
        return false;
    }

    public boolean editStudent() {
        System.out.println("Enter ID you want to edit: ");
        String idToEdit = sc.nextLine();
        for (Student student : StudentList) {
            if (student.ID.equalsIgnoreCase(idToEdit)) {
                System.out.print("Editing information for students " + idToEdit);
                student.enterStudent();
                System.out.println("Editing complete");
                return true;
            }
        }
        System.out.println("Student by id " + idToEdit + "not found.");
        return false;
    }
}
