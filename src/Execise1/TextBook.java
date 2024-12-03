package Execise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {

    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter status: ");
        status = sc.nextLine();
    }

    @Override
    public void displayBook() {
        System.out.println(" ,Status: " + status);
    }

    public void updateBook() {
        System.out.println("Enter in4 you wait to edit: ");
        System.out.println("1. Publisher");
        System.out.println("2. Entry date");
        System.out.println("3. Unit price");
        System.out.println("4. Quantity");
        System.out.println("5. Status");
        System.out.println("5. Exit");
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
                status = sc.nextLine();
            }
            case 6: {
                System.out.println("Exit complete. ");
            }
            default:
                System.out.println("Your choice is not true. ");

        }
    }
}
