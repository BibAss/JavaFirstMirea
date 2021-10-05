package ru.mirea.task6.Nameable;

public class Companies implements  Nameable{
    private String CompanyName;

    public Companies(String name)
    {
        CompanyName = name;
    }

    @Override
    public String getName()
    {
        return CompanyName;
    }
}
