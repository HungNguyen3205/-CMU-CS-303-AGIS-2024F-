package Assignment9.OOPs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    String ID, FullName, Majoy;
    float GPA;
    Date dateOfbirth;
    public Student(String ID, String FullString, String Majoy, Date dateOfbirth, float GPA){
        this.ID = ID;
        this.FullName = FullString;
        this.GPA = GPA;
        this.Majoy = Majoy;
        this.dateOfbirth = dateOfbirth;
    }
    public Student (){}
    void enterStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        ID = sc.nextLine();
        System.out.println("Enter Full name: ");
        FullName = sc.nextLine();
        System.out.println("Enter majoy: ");
        Majoy = sc.nextLine();
        System.out.println("Enter GPA: ");
        GPA = sc.nextFloat();  
        sc.nextLine();
        System.out.println("Enter date of date(dd/MM/yyyy): ");
        String input_date = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try{
            dateOfbirth =  dateFormat.parse(input_date);
        }catch(ParseException e){
            System.out.println("Invalid date format. Please enter date in dd/MM/yyyy format.");
        }
        
    }
    void displayStudent(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(this.dateOfbirth);
        System.out.println(" ID: "+this.ID+" ,FullName: "+this.FullName+" ,Majoy: "+this.Majoy+" ,GPA: "+this.GPA+" ,Day of birth: "+formattedDate);
    }
}
