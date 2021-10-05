package ru.mirea.task7.Shape;
import java.math.MathContext;

public class Circle extends Shape {
    protected double _radius;

    public Circle(){};
    public Circle(double radius) {
        this._radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this._radius = radius;
        this._color = color;
        this._filled = filled;
    }

    public double get_radius() {
        return _radius;
    }
    public void set_radius(double _radius) {
        this._radius = _radius;
    }

    @Override
    public double getArea() {
        return Math.PI * _radius * _radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI * _radius * 2;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "_radius=" + _radius +
                ", _color='" + _color + '\'' +
                ", _filled=" + _filled +
                '}';
    }
}
