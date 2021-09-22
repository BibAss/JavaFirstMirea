package ru.mirea.task2.Ball;

public class BallTester {

    public static void main(String[] args) {
        Ball ball = new Ball("Красный", 10);
        System.out.println(ball.toString());
        ball.setBallColour("Зелёный");
        ball.setBallRadius(20);
        System.out.println((ball.toString()));
    }
}
