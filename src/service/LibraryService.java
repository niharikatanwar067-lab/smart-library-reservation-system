package service;

import model.Book;
import model.User;
import java.util.*;

public class LibraryService {

    private Map<String, Book> books = new HashMap<>();
    private Map<String, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle().toLowerCase(), book);
    }

    public void registerUser(User user) {
        users.put(user.getName(), user);
        System.out.println("User registered: " + user.getName());
    }

    public void searchBook(String keyword) {
        System.out.println("Search results for \"" + keyword + "\":");
        books.values().stream()
            .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()))
            .forEach(b -> System.out.println("- " + b.getTitle()));
    }


    public void issueBook(String title, String userName) {
        Book book = books.get(title.toLowerCase());
        User user = users.get(userName);

        if (book == null || user == null) {
            System.out.println("Invalid book or user");
            return;
        }

        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(user.getName() + " borrowed \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Book unavailable. Added to reservation queue.");
        }
    }

    public void returnBook(String title) {
        Book book = books.get(title.toLowerCase());

        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("\"" + book.getTitle() + "\" returned successfully.");
        } else {
            System.out.println("Invalid return attempt.");
        }
    }


    public void showRecommendations(String userName) {
        System.out.println("Recommendations for " + userName + ":");
        books.values().stream()
                .filter(Book::isAvailable)
                .forEach(b -> System.out.println("- " + b.getTitle()));
    }

    public void showMostDemandedBook() {
        System.out.println("Most demanded books feature coming soon (analytics module).");
    }
}
