package ru.mirea.task7.Shape;

public abstract class Shape {
    protected String _color;
    protected boolean _filled;

    public Shape(){};
    public Shape(String color, boolean filled)
    {
        _color = color;
        _filled = filled;
    }

    public String get_color() {
        return _color;
    }
    public void set_color(String _color) {
        this._color = _color;
    }

    public boolean is_filled()
    {
        return  _filled;
    }
    public void set_filled(boolean _filled) {
        this._filled = _filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
