package ru.mirea.task6.Nameable;

public class Car implements Nameable {
    private String CarName;

    public Car(String name)
    {
        CarName = name;
    }

    @Override
    public String getName()
    {
        return CarName;
    }
}
