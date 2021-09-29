package ru.mirea.task5.Dish;

public class Cup extends Dish {
    Cup(String mat, String col)
    {
        super(mat, col);
    }

    @Override
    public String Verb()
    {
        return "В неё наливают жидкость";
    }
}
