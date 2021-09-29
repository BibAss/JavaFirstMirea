package ru.mirea.task3.Book;

public class Book {
    private String Name;
    private int PageNumbers;
    private String AuthorName;

    Book(String name, String auth_name, int num)
    {
        this.SetAuthorName(auth_name);
        this.setName(name);
        this.setPageNumbers(num);
    }

    public void setName(String name)
    {
        Name = name;
    }
    public void SetAuthorName(String auth_name)
    {
        AuthorName = auth_name;
    }
    public void setPageNumbers(int pageNumbers)
    {
        PageNumbers = pageNumbers;
    }

    public  String getName()
    {
        return Name;
    }
    public String getAuthorName()
    {
        return AuthorName;
    }
    public int getPageNumbers()
    {
        return PageNumbers;
    }

    @Override
    public String toString() {
        return "Название книги = " + getName() + "; " + "Имя автора: " + getAuthorName() + "; " +"Количество страниц = " + getPageNumbers();
    }
}
