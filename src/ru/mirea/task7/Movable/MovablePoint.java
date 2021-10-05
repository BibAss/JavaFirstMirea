package ru.mirea.task7.Movable;

public class MovablePoint implements Movable{
    int x, xSpeed, y, ySpeed;

    public MovablePoint(int x, int xSpeed, int y, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", xSpeed=" + xSpeed +
                ", y=" + y +
                ", ySpeed=" + ySpeed +
                '}';
    }
    @Override
    public void moveUp() {
        y += ySpeed;
    }
    @Override
    public void moveDown() {
        y -= ySpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
}
