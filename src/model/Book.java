package model;
public class Book {
    String title;
    String author;
    String genre;
    boolean available;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }
}
