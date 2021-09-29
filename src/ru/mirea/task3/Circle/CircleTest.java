package ru.mirea.task3.Circle;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        double rad = sc.nextDouble();

        Circle circle_1 = new Circle(rad);
        circle_1.setRadius(3);

        System.out.println(circle_1);
        System.out.println(circle_1.getArea());
        System.out.println(circle_1.getLength());
    }
}
