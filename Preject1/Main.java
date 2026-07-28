import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public void displayInfo() {
        System.out.println("[" + isbn + "] " + title + " by " + author + " | Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}
class LibrarySystem {
    private Map<String, Book> bookCatalog = new HashMap<>();
    private LinkedList<String> transactionHistory = new LinkedList<>();
    public void addBook(String isbn, String title, String author) {
        if (bookCatalog.containsKey(isbn)) {
            System.out.println("Error: A book with ISBN " + isbn + " already exists.");
            return;
        }
        Book newBook = new Book(isbn, title, author);
        bookCatalog.put(isbn, newBook);
        System.out.println("Success: '" + title + "' added to catalog.");
    }
    public void borrowBook(String isbn, String borrowerName) {
        Book book = bookCatalog.get(isbn);
        if (book == null) {
            System.out.println("Error: Book with ISBN " + isbn + " not found.");
            return;
        }
        if (book.isAvailable()) {
            book.setAvailable(false);
            transactionHistory.addFirst(borrowerName + " borrowed '" + book.getTitle() + "'");
            System.out.println("Success: '" + book.getTitle() + "' issued to " + borrowerName + ".");
        } else {
            System.out.println("Sorry: '" + book.getTitle() + "' is already checked out.");
        }
    }
    public void returnBook(String isbn) {
        Book book = bookCatalog.get(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            transactionHistory.addFirst("Returned '" + book.getTitle() + "'");
            System.out.println("Success: '" + book.getTitle() + "' is now available again.");
        } else {
            System.out.println("Error: Book was not checked out or invalid ISBN.");
        }
    }
    public void displayCatalog() {
        if (bookCatalog.isEmpty()) {
            System.out.println("\n--- Catalog is completely empty! ---");
            return;
        }
        System.out.println("\n--- Current Library Catalog ---");
        for (Book book : bookCatalog.values()) {
            book.displayInfo();
        }
        System.out.println("-------------------------------\n");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem library = new LibrarySystem();

        System.out.println("=== Welcome to the Library Management System ===");
        System.out.print("Enter Manager Name: ");
        String managerName = scanner.nextLine();
        System.out.println("Hello Manager " + managerName + ", initializing system terminal...\n");
        boolean running = true;
        while (running) {
            System.out.println("\n--- MANAGER DASHBOARD ---");
            System.out.println("1. Add New Book");
            System.out.println("2. Issue/Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View All Inventory");
            System.out.println("5. Exit System");
            System.out.print("Select an option (1-5): ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please enter a valid number.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(isbn, title, author);
                    break;
                case 2:
                    System.out.print("Enter Book ISBN to Issue: ");
                    String issueIsbn = scanner.nextLine();
                    System.out.print("Enter Borrower (Student) Name: ");
                    String student = scanner.nextLine();
                    library.borrowBook(issueIsbn, student);
                    break;
                case 3:
                    System.out.print("Enter Book ISBN to Return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 4:
                    library.displayCatalog();
                    break;
                case 5:
                    System.out.println("Logging out. Goodbye, Manager " + managerName + "!");
                    running = false;
                    break;
                default:
                    System.out.println("Out of range. Pick options 1 to 5.");
            }
        }
        scanner.close();
    }
}
