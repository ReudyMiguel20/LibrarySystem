package org.example;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Initializing variables and objects.
        Scanner scanner = new Scanner(System.in);
        Library oceanLibrary = new Library();
        UserInterface UI = new UserInterface();

        UI.startUI(oceanLibrary, scanner);

    }

}