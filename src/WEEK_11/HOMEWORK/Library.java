package WEEK_11.HOMEWORK;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void listBooks() {
        for (Book book : books) {
            book.printfInfo();
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}




