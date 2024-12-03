package Execise1;

import java.util.ArrayList;

public class BookList {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book instanceof TextBook) {
            System.out.println("Add Text book to list");
        } else if (book instanceof ReferenceBook) {
            System.out.println("Add ReferenceBook to list");
        } else {
            System.out.println("Unknown book type. Adding as generic Book.");
        }
        books.add(book);
    }

    public void displayBook() {
        for (Book b : books) {
            System.out.println(b.toString());
            b.displayBook();
        }
    }   

    public void updateBook(String id) {
        boolean found = false;
        for (Book b : books) {
            if (b.getBookId().equalsIgnoreCase(id)) {
                System.out.println("Book found. Enter new details:");
                b.updateBook(id);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book found with ID: " + id);
        }
    }

    public Book findBookById(String id) {
        for (Book b : books) {
            if (b.getBookId().equalsIgnoreCase(id)) {
                System.out.println("Book found: " + b.toString());
                return b;
            }
        }
        System.out.println("No book found with ID: " + id);
        return null;
    }

    public void deleteBook(String id) {
        Book bookdelete = null;
        for (Book b : books) {
            if (b.getBookId().equals(id)) {
                bookdelete = b;
                break;
            }
        }
        if (bookdelete != null) {
            books.remove(bookdelete);
            System.out.println("Book with ID " + id + " has been removed.");
        } else {
            System.out.println("No book found with ID: " + id);
        }
    }
}
