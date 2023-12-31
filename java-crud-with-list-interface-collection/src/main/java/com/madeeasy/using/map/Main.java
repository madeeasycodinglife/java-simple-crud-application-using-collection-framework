package com.madeeasy.using.map;

import com.madeeasy.using.map.exception.BookNotFoundException;
import com.madeeasy.using.map.service.BookService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BookService bookService = new BookService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create new book");
            System.out.println("2. Update book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Display book by id");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = 0;

            while (true) {
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Sorry you have to enter a number !!");
                    System.out.print("Enter your choice : ");
                    scanner.nextLine(); // it consumes new line character
                }
            }

            switch (choice) {
                case 1:
                    bookService.createNewBook();
                    break;
                case 2:
                    System.out.print("Enter book id to update : ");
                    String id = scanner.nextLine();
                    try {
                        bookService.updateBookById(id);
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter book id to delete : ");
                    String idToDelete = scanner.nextLine();
                    try {
                        bookService.deleteBookById(idToDelete);
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter book id to get : ");
                    String idToGet = scanner.nextLine();
                    try {
                        bookService.displayBookById(idToGet);
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    bookService.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Thanks for using this application !!");
                    return;
                default:
                    System.out.println("Please enter a valid choice !!");
            }
        }
    }
}
