package org.example;

import java.util.List;
import java.util.ArrayList;
public class Books extends Library {
    private String bookName;
    private String authorName;
    private int publicationYear;
    private boolean isBookAvailable;

    public Books(String bookName, String authorName, int publicationYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        isBookAvailable = true;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return this.isBookAvailable;
    }

    public void checkoutBook(int Book) {
        this.isBookAvailable = false;
    }

    public String toString() {
        return "Book Name: " + this.bookName + ", Author Name: " + this.authorName + ", Publication Year: " + this.publicationYear + ", Available Status: " + isAvailable();
    }


}
