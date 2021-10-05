package ru.mirea.task7.Shape;

public class Rectangle extends Shape {
    protected double _width;
    protected double _length;

    public Rectangle(){};
    public Rectangle(double width, double length) {
        this._width = width;
        this._length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this._width = width;
        this._length = length;
        this._color = color;
        this._filled = filled;
    }

    public double get_width() {
        return _width;
    }
    public void set_width(double _width) {
        this._width = _width;
    }

    public double get_length() {
        return _length;
    }
    public void set_length(double _length) {
        this._length = _length;
    }

    @Override
    public double getArea() {
        return _length * _width;
    }
    @Override
    public double getPerimeter() {
        return _length * 2 + _width * 2;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "_width=" + _width +
                ", _length=" + _length +
                ", _color='" + _color + '\'' +
                ", _filled=" + _filled +
                '}';
    }
}
