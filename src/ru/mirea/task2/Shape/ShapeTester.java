package ru.mirea.task2.Shape;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Shape("Квадрат");
        System.out.println(shape.toString());
        shape.setShapeName("Прямоугольник");
        System.out.println(shape.toString());
    }
}
