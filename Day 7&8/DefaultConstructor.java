class Book {
    String title;
    String author;

    Book() {
        title = "Unknown";
        author = "Unknown";
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Book b = new Book();
        b.display();
    }
}
