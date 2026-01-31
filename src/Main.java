import model.*;
import service.*;
import dsa.*;

public class Main {

    private static LibraryService libraryService;

    public static void main(String[] args) {

        System.out.println("===== SMART LIBRARY MANAGEMENT SYSTEM =====\n");

        libraryService = new LibraryService();

        setupBooks();
        setupUsers();
        searchBooks();
        issueBooks();
        returnBook();
        showDemandAnalysis();
        showRecommendations();

        System.out.println("\n===== END OF SESSION =====");
    }

    // 1. Add books to library
    private static void setupBooks() {
        System.out.println("Adding books to library...");

        libraryService.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy"));
        libraryService.addBook(new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy"));
        libraryService.addBook(new Book("Percy Jackson", "Rick Riordan", "Mythology"));

        System.out.println();
    }

    // 2. Register users
    private static void setupUsers() {
        System.out.println("Registering users...");

        libraryService.registerUser(new User("Alice", 2));
        libraryService.registerUser(new User("Bob", 1));
        libraryService.registerUser(new User("Charlie", 3));

        System.out.println();
    }

    // 3. Search books using Trie
    private static void searchBooks() {
        System.out.println("Searching books...");

        libraryService.searchBook("Har");
        libraryService.searchBook("Lor");

        System.out.println();
    }

    // 4. Issue books & create reservations
    private static void issueBooks() {
        System.out.println("Issuing books...");

        libraryService.issueBook("Harry Potter", "Alice");
        libraryService.issueBook("Harry Potter", "Bob");
        libraryService.issueBook("Harry Potter", "Charlie");

        System.out.println();
    }

    // 5. Return book & auto-assign
    private static void returnBook() {
        System.out.println("Returning book...");

        libraryService.returnBook("Harry Potter");

        System.out.println();
    }

    // 6. Show demand analysis
    private static void showDemandAnalysis() {
        System.out.println("Demand analysis...");

        libraryService.showMostDemandedBook();

        System.out.println();
    }

    // 7. Show recommendations
    private static void showRecommendations() {
        System.out.println("Recommendations...");

        libraryService.showRecommendations("Alice");

        System.out.println();
    }
}
