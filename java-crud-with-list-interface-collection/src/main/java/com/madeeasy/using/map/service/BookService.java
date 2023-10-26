package com.madeeasy.using.map.service;

import com.madeeasy.using.map.exception.BookNotFoundException;
import com.madeeasy.using.map.model.Author;
import com.madeeasy.using.map.model.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookService {

    Map<String, Book> bookMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    // create new book

    public void createNewBook() {
        System.out.print("Enter book id : ");
        String id = scanner.nextLine();
        System.out.print("Enter book title : ");
        String title = scanner.nextLine();
        System.out.print("Enter author id : ");
        String authorId = scanner.nextLine();
        System.out.print("Enter author first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter author last name : ");
        String lastName = scanner.nextLine();
        Author author = new Author(authorId, firstName, lastName);
        Book book = new Book(id, title, author);
        bookMap.put(id, book);
    }

    // update book by id

    public void updateBookById(String id) {
        Book found = findById(id);
        if (found == null) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        System.out.print("Enter book id : ");
        String bookId = scanner.nextLine();
        System.out.print("Enter book title : ");
        String title = scanner.nextLine();
        System.out.print("Enter author id : ");
        String authorId = scanner.nextLine();
        System.out.print("Enter author first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter author last name : ");
        String lastName = scanner.nextLine();
        Author author = new Author(authorId, firstName, lastName);
        Book book = new Book(bookId, title, author);
        bookMap.put(id, book);
    }
    // delete book by id

    public void deleteBookById(String id) {
        Book found = findById(id);
        if (found == null) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        bookMap.remove(id);
        System.out.println("Book removed successfully for id " + id);
    }

    // get book by id

    public Book findById(String id) {
        if (!bookMap.containsKey(id)) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        return bookMap.get(id);
    }

    // display the book by id
    public void displayBookById(String id) throws BookNotFoundException {
        Book found = findById(id);
        if (found == null) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        System.out.println(found);
    }

    // display all books
    public void displayAllBooks() {
        // with key and value
        if (!bookMap.isEmpty()) {
            for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } else {
            System.out.println("Sorry! BookMap is empty");
        }
    }
}

