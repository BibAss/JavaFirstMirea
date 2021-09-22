package ru.mirea.task2.Shape;

public class Shape
{
    private String ShapeName;

    Shape(String name)
    {
        this.setShapeName(name);
    }

    public void setShapeName(String name)
    {
        ShapeName = name;
    }

    public String getShapeName()
    {
        return ShapeName;
    }

    @Override
    public String toString() {
        return "Фигура: " + this.getShapeName();
    }
}
