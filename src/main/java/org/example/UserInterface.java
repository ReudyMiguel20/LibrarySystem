package org.example;

import java.util.Scanner;

public class UserInterface extends Library {

    public UserInterface() {

    }

    public void startUI(Library library, Scanner scanner) {
        String stringInput = "";
        int numInput = 0;

        System.out.println("Library System EZPZ v0.3");

        while (true) {
            System.out.println("Command List");
            System.out.println("1 - Add Book");
            System.out.println("2 - Delete Book");
            System.out.println("3 - Search Book");
            System.out.println("4 - Checkout Book");
            System.out.println("5 - Return Book");
            System.out.println("6 - Display");
            System.out.println("7 - User Management");

            stringInput = scanner.nextLine();

            if (stringInput.equals("1")) {
                //Asking for User Input to Add Book
                System.out.println("-- Adding Book -- ");
                System.out.println("\n- Please add the ID for the book");
                int bookID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("- Please create the book: Give the details in this order: (BookName, AuthorName, Publication Year)");
                String createBook = scanner.nextLine();

                //Splitting the input and then converting the last input that is the year to integer
                String[] createBookDetails = createBook.split(",");
                String year = createBookDetails[2].trim();
                int yearBook = Integer.parseInt(year);

                //Creating new object type Books nad adding it to the BookShelf (Hashmap)
                Books book = new Books(createBookDetails[0], createBookDetails[1], yearBook);
                addBook(bookID, book);
                System.out.println("\n-- The following book have been added successfully: --\n" + book.toString() + "\n");

            } else if (stringInput.equals("2")) {
                //Asking for User Input to Remove Book
                System.out.println("-- Removing Book -- ");
                System.out.println("Input the ID of the book that you would like to remove");
                numInput = scanner.nextInt();
                scanner.nextLine();

                //Removing the asked book and returning a string to let the user know that it has been deleted.
                String deletedBook = getBookDetails(numInput);
                removeBook(numInput);
                System.out.println("\n-- The following book have been removed successfully: --\n" + deletedBook + "\n");

            } else if (stringInput.equals("3")) {
                //Asking for User Input to Search a Book
                System.out.println("\n-- Searching for Book --");
                System.out.println("Would you like to search a book for its: ");
                System.out.println("1 - ID");
                System.out.println("2 - Book Name");
                System.out.println("3 - Author Name");
                System.out.println("4 - Publication Year");

                numInput = scanner.nextInt();
                scanner.nextLine();

                switch (numInput) {
                    case 1 -> {
                        System.out.println("Input the ID number of the book:");
                        numInput = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(getBookDetails(numInput));
                    }
                    case 2 -> {
                        System.out.println("Input the Book name:");
                        stringInput = scanner.nextLine();

                        System.out.println(getBookByBookName(stringInput));
                    }
                    case 3 -> {
                        System.out.println("Input the Author name:");
                        stringInput = scanner.nextLine();

                        System.out.println(getBookByAuthorName(stringInput));
                    }
                    case 4 -> {
                        System.out.println("Input the Publication year:");
                        numInput = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println(getBookByPublicationYear(numInput));
                    }
                    default -> {
                        System.out.println("The input number isn't correct, going back to the menu...\n");
                    }
                }

            }
        }
    }
}
