package ru.mirea.task10;

import java.util.Scanner;

public class opt10 {
    private static Scanner sc;
    private static int d;
    private static int mun = 0;

    public static void main(String[] args) {
        System.out.println("Enter the number");
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num / 10) == 0)
        {
            System.out.println(num);
            return;
        }
        Revers(num);
        System.out.println(mun);
    }
    public static void Revers (int num)
    {
        d = num % 10;
        num /= 10;
        mun *= 10;
        mun += d;
        if((num / 10) != 0) {Revers(num);}
        else
        {
            mun *= 10;
            mun += num;
            return;
        }
    }
}
