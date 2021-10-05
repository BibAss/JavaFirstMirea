package ru.mirea.task7.Movable;

public class MovableRectangle implements  Movable{
    private MovablePoint _topLeft;
    private MovablePoint _bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
    {
        _topLeft.x = x1;
        _topLeft.y = y1;
        _bottomRight.x = x2;
        _bottomRight.y = y2;
        _bottomRight.xSpeed = _topLeft.xSpeed = xSpeed;
        _bottomRight.ySpeed = _topLeft.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "_topLeft=" + _topLeft +
                ", _bottomRight=" + _bottomRight +
                '}';
    }
    @Override
    public void moveUp() {
    _topLeft.y += _topLeft.ySpeed;
    _bottomRight.y += _bottomRight.ySpeed;
    }
    @Override
    public void moveDown() {
        _topLeft.y -= _topLeft.ySpeed;
        _bottomRight.y -= _bottomRight.ySpeed;
    }
    @Override
    public void moveRight() {
        _topLeft.x += _topLeft.xSpeed;
        _bottomRight.x += _bottomRight.xSpeed;
    }
    @Override
    public void moveLeft() {
        _topLeft.x -= _topLeft.xSpeed;
        _bottomRight.x -= _bottomRight.xSpeed;
    }
}
