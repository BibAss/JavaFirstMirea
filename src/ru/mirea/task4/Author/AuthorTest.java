package ru.mirea.task4.Author;

public class AuthorTest {
    public static void main(String[] args) {
        Author author1 = new Author("Gagaladze", "GaGa2020@gmail.com", 'F');
        System.out.println(author1);
        System.out.println(author1.getName());
        System.out.println(author1.getEmail());
        System.out.println(author1.getGender());
        Author author2 = new Author("Pelevin", "BestFilosoff@mail.ru", 'M');
        author2.setEmail("Pele@gmail.com");
        System.out.println(author2);
    }
}
