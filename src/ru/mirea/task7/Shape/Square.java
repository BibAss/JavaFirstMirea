package ru.mirea.task7.Shape;

public class Square extends Rectangle{
    protected double _side;

    public Square(){};
    public Square(double _side) {
        this._side = _side;
    }
    public Square(String color, boolean filled, double _side) {
        this._color = color;
        this._filled = filled;
        this._side = _side;
    }

    public double get_side() {
        return _side;
    }
    public void set_side(double _side) {
        this._side = _side;
    }

    @Override
    public void set_width(double _side) {
        super.set_width(_side);
    }
    @Override
    public void set_length(double _side) {
        super.set_length(_side);
    }
    @Override
    public String toString() {
        return "Square{" +
                "_color='" + _color + '\'' +
                ", _filled=" + _filled +
                ", _side=" + _side +
                '}';
    }
}
