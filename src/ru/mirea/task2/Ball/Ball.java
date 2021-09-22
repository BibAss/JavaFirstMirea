package ru.mirea.task2.Ball;

public class Ball {
    private String BallColour;
    private int BallRadius;

    Ball(String name, int rad)
    {
        this.setBallColour(name);
        this.setBallRadius(rad);
    }

    public void setBallColour(String name)
    {
        BallColour = name;
    }
    public void setBallRadius(int rad) { BallRadius = rad; }

    public String getBallColour()
    {
        return BallColour;
    }
    public int getBallRadius()
    {
        return BallRadius;
    }

    @Override
    public String toString() {
        return "Цвет шара: " + this.getBallColour() + "; " + "Радиус шара: " + this.getBallRadius();
    }
}
