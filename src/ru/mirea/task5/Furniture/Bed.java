package ru.mirea.task5.Furniture;

public class Bed extends Furniture{
    Bed(String country, int count, double price)
    {
        super(country, count, price);
    }
    @Override
    public String getType()
    {
        return "Bed";
    }
}
