package ru.mirea.task2.Book;

public class Book {
    private String Name;
    private int PageNumbers;

    Book(String name, int num) {
        this.setName(name);
        this.setPageNumbers(num);
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPageNumbers(int pageNumbers) {
        PageNumbers = pageNumbers;
    }

    public String getAuthorName() {
        return Name;
    }
    public int getPageNumbers() {
        return PageNumbers;
    }

    @Override
    public String toString() {
        return "Название книги = " + Name + "; " + "Количество страниц = " + PageNumbers;
    }
}
