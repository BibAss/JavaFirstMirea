package ru.mirea.task4.Ball;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);

        Ball ball1 = new Ball(6, 13);
        System.out.println(ball1);
        System.out.println(ball1.getX());
        ball1.move(15, -30);
        System.out.println(ball1);
    }
}
