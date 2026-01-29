import model.*;
import service.*;
import dsa.*;

public class Main {

    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        // Add books
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy"));
        library.addBook(new Book("Atomic Habits", "James Clear", "Self Help"));

        // Create users
        User alice = new User("Alice", 1);   // student
        User bob = new User("Bob", 3);       // faculty
        User charlie = new User("Charlie", 2);

        // Search books
        library.searchBook("Harry Potter");
        library.searchBook("Unknown Book");

        // Borrowing
        library.requestBook("Harry Potter", alice);
        library.requestBook("Harry Potter", charlie);
        library.requestBook("Harry Potter", bob);

        // Return book
        library.returnBook("Harry Potter");

        // Demand insight
        library.showMostDemandedBook();
    }
}
