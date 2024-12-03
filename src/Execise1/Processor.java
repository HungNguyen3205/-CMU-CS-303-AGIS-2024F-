package Execise1;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add new book");
            System.out.println("2. Update book by ID");
            System.out.println("3. Delete book by ID");
            System.out.println("4. Find book by ID");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book type (1 for TextBook, 2 for ReferenceBook): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        TextBook tb = new TextBook();
                        tb.addBook();
                        bookList.addBook(tb);
                    } else if (type == 2) {
                        ReferenceBook r = new ReferenceBook();
                        r.addBook();
                        bookList.addBook(r);
                    } else {
                        System.out.println("Unknown book type. Skipping...");
                    }
                    break;

                case 2:

                    System.out.print("Enter the ID of the book to update: ");
                    String updateId = sc.nextLine();
                    bookList.updateBook(updateId);
                    break;

                case 3:

                    System.out.print("Enter the ID of the book to delete: ");
                    String deleteId = sc.nextLine();
                    bookList.deleteBook(deleteId);
                    break;

                case 4:

                    System.out.print("Enter the ID of the book to find: ");
                    String findId = sc.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.toString());
                    }
                    break;

                case 5:

                    bookList.displayBook();
                    break;

                case 6:

                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 6);

    }
}
