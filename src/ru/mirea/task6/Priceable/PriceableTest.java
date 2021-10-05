package ru.mirea.task6.Priceable;

public class PriceableTest {
    public static void main(String[] args) {
        Dishes dish = new Dishes(250);
        Forks fork = new Forks(100);
        Spoons spoon = new Spoons(120);

        dish.getPrice();
        fork.getPrice();
        spoon.getPrice();
    }
}
