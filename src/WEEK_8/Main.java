package WEEK_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = createBooks();
        listBooks(books);
        listBooksPublishedAfter(books,2010);
        listBooksByAuthor(books,"Author 1");
    }
    public static ArrayList<Book> createBooks(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book 1","Author 1",2023));
        books.add(new Book("Book 2","Author 2",2020));
        books.add(new Book("Book 3","Author 3",2005));
        return books;
    }

    public static void listBooks(ArrayList<Book> books){
        System.out.println("ALL BOOKS");
        for (Book book : books){
            printBookDetails(book);
        }
    }
    public static void listBooksPublishedAfter(ArrayList<Book> books,int year){
        System.out.println("BOOKS PUBLISHED AFTER A CERTAIN YEAR");
        for (Book book : books){
            printBookDetails(book);
        }
    }

    public static void listBooksByAuthor(ArrayList<Book> books,String author){
        System.out.println("BOOKS BY SPECIFIC AUTHOR");
        for (Book book : books){
            if (book.author.equals(author)){
                printBookDetails(book);
            }
        }
    }

    public static void printBookDetails(Book book){
        System.out.println("-----------------------------------");
        System.out.println("Book name: " + book.bookName);
        System.out.println("Author: " + book.author);
        System.out.println("Publication Year: " + book.publicationYear);
        System.out.println("-----------------------------------");
    }
}

