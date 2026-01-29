package service;

import model.*;
import dsa.*;

import java.util.HashMap;

public class LibraryService {

    private HashMap<String, Book> books;
    private Trie trie;
    private ReservationManager reservationManager;
    private DemandAnalyzer demandAnalyzer;

    public LibraryService() {
        books = new HashMap<>();
        trie = new Trie();
        reservationManager = new ReservationManager();
        demandAnalyzer = new DemandAnalyzer();
    }

    public void addBook(Book book) {
        books.put(book.title.toLowerCase(), book);
        trie.insert(book.title);
    }

    public void requestBook(String title, User user) {
        title = title.toLowerCase();
        demandAnalyzer.recordRequest(title);

        Book book = books.get(title);

        if (book != null && book.available) {
            book.available = false;
            System.out.println(user.name + " borrowed \"" + book.title + "\"");
        } else {
            reservationManager.addToQueue(user);
            System.out.println(
                "Book unavailable. " + user.name + " added to reservation queue."
            );
        }
    }

    public void returnBook(String title) {
        title = title.toLowerCase();
        Book book = books.get(title);

        if (book == null) return;

        if (reservationManager.hasWaitingUsers()) {
            User nextUser = reservationManager.getNextUser();
            System.out.println(
                nextUser.name + " borrowed \"" + book.title + "\" from reservation queue."
            );
        } else {
            book.available = true;
            System.out.println("\"" + book.title + "\" is now available.");
        }
    }

    public void searchBook(String title) {
        if (trie.search(title)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    public void showMostDemandedBook() {
        String book = demandAnalyzer.getMostDemandedBook();
        if (book != null) {
            System.out.println("Most demanded book: " + book);
        }
    }
}
