package ru.mirea.task5.Dog;

public class Staff extends Dog {
    Staff(String name, String origin)
    {
        super(name, origin);
    }

    @Override
    public int YearsOfLife()
    {
        return 14;
    }
}
