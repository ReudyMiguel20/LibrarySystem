package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Library {
    private HashMap<Integer, Books> bookShelf;

    public Library() {
        this.bookShelf = new HashMap<>();
    }

    public void addBook(int ID, Books book) {
        this.bookShelf.put(ID, book);
    }

    public void removeBook(int ID) {
        this.bookShelf.remove(ID);
    }

    public HashMap<Integer, Books> getBookShelf() {
        return this.bookShelf;
    }

    public String getBookByBookName(String bookName) {
        String foundBook = "";
        StringBuilder sb = new StringBuilder("\n");

        for (Books book : this.bookShelf.values()) {

            if (book.getBookName().contains(bookName)) {
                sb.append(book).append("\n");
            }

        }
        foundBook = sb.toString();
        return foundBook;
    }

    public String getBookByAuthorName(String authorName) {
        String foundBook = "";
        StringBuilder sb = new StringBuilder("\n");

        for (Books book : this.bookShelf.values()) {

            if (book.getAuthorName().contains(authorName)) {
                sb.append(book).append("\n");
            }

        }
        foundBook = sb.toString();
        return foundBook;
    }

    public String getBookByPublicationYear(int publicationYear) {
        String foundBook = "";
        StringBuilder sb = new StringBuilder("\n");

        for (Books book : this.bookShelf.values()) {

            if (book.getPublicationYear() == publicationYear) {
                sb.append(book).append("\n");
            }

        }
        foundBook = sb.toString();
        return foundBook;
    }

    public void saveBooks() {
        try {
            PrintWriter writer = new PrintWriter("C:/Users/mikec/IdeaProjects/LibrarySystem/src/main/resources/BooksAvailable");
            for (Map.Entry<Integer, Books> entry : this.bookShelf.entrySet()) {
                writer.println(entry.getKey() + " = " + entry.getValue().getBookName() + "," + entry.getValue().getAuthorName()
                        + "," + entry.getValue().getPublicationYear() + "," + entry.getValue().isAvailable());
            }
            writer.close();
            System.out.println("Books have been saved to file successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while saving Hashmap...");
        }
    }

    public void loadBooks() {

    }

    public String getBookDetails(int ID) {
        return this.bookShelf.get(ID).toString();
    }

}