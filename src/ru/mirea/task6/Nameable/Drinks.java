package ru.mirea.task6.Nameable;

public class Drinks implements Nameable {
    private String DrinkName;

    public Drinks(String name)
    {
        DrinkName = name;
    }

    @Override
    public String getName()
    {
        return DrinkName;
    }
}
