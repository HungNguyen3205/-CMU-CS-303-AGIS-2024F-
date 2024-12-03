package Execise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook() {

    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tax: ");
        tax = sc.nextDouble();
    }

    @Override
    public void displayBook() {
        System.out.println(" ,Tax: " + tax);
    }
    
    public void updateBook() {
        System.out.println("Enter number you want edit: ");
        System.out.println("1. Publisher");
        System.out.println("2. Entry date");
        System.out.println("3. Unit price");
        System.out.println("4. Quantity");
        System.out.println("5. Tax");
        System.out.println("6. Exit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println("Edit publisher ");
                publisher = sc.nextLine();
            }
            case 2: {
                System.out.println("Edit date entry ");
                SimpleDateFormat dateformat = new SimpleDateFormat();
                String input2 = sc.nextLine();
                try {
                    entryDate = dateformat.parse(input2);
                } catch (ParseException e) {
                    System.out.println("Fail! Pls enter folow(DD/MM/YYYY):");
                }
            }
            case 3: {
                System.out.println("Edit unit price ");
                unitPrice = sc.nextDouble();
            }
            case 4: {
                System.out.println("Edit quantity ");
                quantity = sc.nextDouble();
            }
            case 5: {
                System.out.println("Edit status ");
                tax = sc.nextDouble();
            }
            case 6: {
                System.out.println("Exit complete. ");
            }
            default:
                System.out.println("Your choice is not true. ");

        }
    }
}
