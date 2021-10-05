package ru.mirea.task6.Nameable;

public class NameableTest {
    public static void main(String[] args) {
        Car ford = new Car("Ford");
        Companies PIK = new Companies("PIK");
        Drinks cola = new Drinks("Coca-cola");

        System.out.println(ford.getName());
        System.out.println(PIK.getName());
        System.out.println(cola.getName());
    }
}
