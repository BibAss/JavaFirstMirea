package ru.mirea.task2.Book;

public class BookTester {
    public static void main(String[] args) {
        Book book = new Book("1984", 328);
        System.out.println(book.toString());
        book.setName("Война и мир");
        book.setPageNumbers(1300);
        System.out.println(book.toString());
    }
}
