package ru.mirea.task7.Movable;

public class MovableCircle implements Movable {
    private int _radius;
    private MovablePoint _center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this._radius = radius;
        this._center.x = x;
        this._center.y = y;
        this._center.xSpeed = xSpeed;
        this._center.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "_radius=" + _radius +
                ", _center=" + _center +
                '}';
    }
    @Override
    public void moveUp() {
        _center.y += _center.ySpeed;
    }
    @Override
    public void moveDown() {
        _center.y -= _center.ySpeed;
    }
    @Override
    public void moveRight() {
        _center.x += _center.xSpeed;
    }
    @Override
    public void moveLeft() {
        _center.x -= _center.xSpeed;
    }
}
