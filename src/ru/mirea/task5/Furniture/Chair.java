package ru.mirea.task5.Furniture;

public class Chair extends Furniture{
    Chair(String country, int count, double price)
    {
        super(country, count, price);
    }

    @Override
    public String getType()
    {
        return "Chair";
    }
}
