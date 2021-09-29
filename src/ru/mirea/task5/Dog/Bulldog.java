package ru.mirea.task5.Dog;

public class Bulldog extends Dog {
    Bulldog(String name, String origin)
    {
        super(name, origin);
    }

    @Override
    public int YearsOfLife()
    {
        return 9;
    }
}

