package ru.mirea.task1.opt5;

public class HarmonicSeries {
    public static void main(String[] args)
    {
        System.out.println("First 10 elements of harmonic series:");
        for (int i = 1; i < 11; i++)
        {
            float c = 1/(float)i;
            System.out.print(String.format("%.3f",c)+"; ");
        }
    }
}
