package org.example;

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

    public String getBookDetails(int ID) {
        return this.bookShelf.get(ID).toString();
    }

}