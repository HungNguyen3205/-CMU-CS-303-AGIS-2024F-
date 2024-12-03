package Execise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {

    String bookId, publisher;
    Date entryDate;
    double unitPrice, quantity;

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Book() {

    }
    public String getBookId(){
        return bookId;
    }
    public String getpublisher() {
        return publisher;
    }

    public Date getEntrydate() {
        return entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id: ");
        bookId = sc.nextLine();
        System.out.println("Enter publisher: ");
        publisher = sc.nextLine();
        System.out.println("Enter entry date: ");
        SimpleDateFormat dateformat = new SimpleDateFormat("DD/MM/YYYY");
        String inputDate = sc.nextLine();
        try {
            entryDate = dateformat.parse(inputDate);
        } catch (ParseException e) {
            System.out.println("Fail! Pls enter folow(DD/MM/YYYY): ");
        }
        System.out.println("Enter unit price: ");
        unitPrice = sc.nextDouble();
        System.out.println("Enter quantity: ");
        quantity = sc.nextDouble();
    }

    @Override
    public void displayBook() {
        System.out.println("Book id: " + bookId + " ,Publisher: " + publisher + " ,Entry date: " + entryDate + " ,Unit price: " + unitPrice + " ,Quantity: " + quantity);
    }

    @Override
    public void updateBook(String id) {
        System.out.println("Enter in4 you wait to edit: ");
        System.out.println("1. Publisher");
        System.out.println("2. Entry date");
        System.out.println("3. Unit price");
        System.out.println("4. Quantity");
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
                System.out.println("Exit complete. ");
            }
            default:
                System.out.println("Your choice is not true. ");

        }
    }
}
