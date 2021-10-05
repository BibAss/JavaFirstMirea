package ru.mirea.task6.Priceable;

public class Dishes implements Priceable{
    private int _price;

    public Dishes(int price)
    {
        _price = price;
    }

    @Override
    public void getPrice() {
        System.out.println("Price of this Dish is: " + _price);
    }
}
