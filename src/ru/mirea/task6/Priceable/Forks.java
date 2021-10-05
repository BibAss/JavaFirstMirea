package ru.mirea.task6.Priceable;

public class Forks implements Priceable{
    private int _price;

    public Forks(int price)
    {
        _price = price;
    }

    @Override
    public void getPrice() {
        System.out.println("Price of this Fork is: " + _price);
    }
}
