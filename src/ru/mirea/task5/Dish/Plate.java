package ru.mirea.task5.Dish;

public class Plate extends Dish{

    Plate(String mat, String col)
    {
        super(mat, col);
    }

    @Override
    public String Verb()
    {
        return "В неё кладут еду";
    }
}
