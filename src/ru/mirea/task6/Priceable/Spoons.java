package ru.mirea.task6.Priceable;

public class Spoons implements Priceable{
    private int _price;

    public Spoons(int price)
    {
        _price = price;
    }

    @Override
    public void getPrice() {
        System.out.println("Price of this Spoon is: " + _price);
    }
}
