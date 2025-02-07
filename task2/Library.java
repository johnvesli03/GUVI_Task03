package com.task2;

public class Library{
    private Book[] books;
    private int count;

    // Constructor (Initialize an array of books)
    public Library() {
        this.books = new Book[5]; // Maximum 5 books
        this.count = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book by bookID
    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[count - 1]; // Replace with the last book
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Required Book not found.");
    }

    // Method to search for a book by bookID
    public Book searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    // Method to display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books are available in the library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}