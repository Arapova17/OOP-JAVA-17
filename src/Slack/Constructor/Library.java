package Slack.Constructor;

import java.util.Arrays;

public class Library {
    int id;
    String name;
    String address;
    Book[] books;

    public Library(int id, String name, String address, Book[] books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public void displayBooks() {
        System.out.println("Library: " + name + " (ID: " + id + ") Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String toString() {
        return "Library: " + name + " (ID: " + id + ", Address: " + address + ")\nBooks: " + Arrays.toString(books);
    }
}
