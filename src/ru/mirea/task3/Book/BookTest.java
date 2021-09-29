package ru.mirea.task3.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("< 1984 >","Джордж Оруэл" , 328);
        System.out.println(book);
        book.setName("< Война и мир >");
        book.SetAuthorName("Л.Н.Толстой");
        book.setPageNumbers(1300);
        System.out.println(book.toString());
    }
}
