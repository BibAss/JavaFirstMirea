package ru.mirea.task3.Circle;

public class Circle {
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle() {}

    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }
    public double getLength()
    {
        return 2 * Math.PI * this.radius;
    }
    public String toString()
    {
        return "Circle{" + "radius=" + this.radius + "}";
    }
}
