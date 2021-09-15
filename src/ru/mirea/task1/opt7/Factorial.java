package ru.mirea.task1.opt7;

import java.util.Scanner;


public class Factorial {
    public static long a = 1;
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int i;

        if(sc.hasNextInt())
        {
            i = sc.nextInt();
            if(i > 0)
            {
                System.out.println("Factorial of your number is:");
                Fact(i);
            }
            else
            {
                System.out.println("Eror in input data");
            }
        }
        else
        {
            System.out.println("Eror in input data");
        }
    }
    public static void Fact(int n)
    {
        if (n > 0)
        {
            a = a * n;
            n -= 1;
            Fact(n);
        }
        else
        {
            System.out.println(a);
        }
    }
}
