package ru.mirea.TRASH;

import java.util.Scanner;

public class Angem {
    public static float K1(float x, float y)
    {
        System.out.println( "K1: ");
        System.out.println( x * x + 0.8f * y);
        return (x * x + 0.8f * y);
    }
    public static float K2(float x, float y)
    {
        float x1 = x + 0.25f;
        float y1 = y + (0.5f * K1(x, y)) / 2;
        System.out.println( "K2: ");
        System.out.println(x1 * x1 + 0.8f * y1);
        return (x1 * x1 + 0.8f * y1);
    }
    public static float K3(float x, float y)
    {
        float x1 = x + 0.25f;
        float y1 = y + (0.5f * K2(x, y)) / 2;
        System.out.println( "K3: ");
        System.out.println(x1 * x1 + 0.8f * y1);
        return (x1 * x1 + 0.8f * y1);
    }
    public static float K4(float x, float y)
    {
        float x1 = x + 0.5f;
        float y1 = y + (0.5f * K3(x, y));
        System.out.println( "K4: ");
        System.out.println(x1 * x1 + 0.8f * y1);
        return (x1 * x1 + 0.8f * y1);
    }
    public static float yi(float x, float y)
    {
        return (y + 0.083f * (K1(x, y) + 2 * K2(x, y) + 2 * K3(x, y) + K4(x, y)));
    }

    public static void main(String[] args) {
        float x = 1.5f;
        Float y = 6.84f;
        System.out.println(yi(x, y));
    }
}
