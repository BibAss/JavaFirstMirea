package ru.mirea.task5.Furniture;

public class Kitchen extends Furniture{
    Kitchen(String country, int count, double price)
    {
        super(country, count, price);
    }

    @Override
    public String getType()
    {
        return "Kitchen";
    }
}
