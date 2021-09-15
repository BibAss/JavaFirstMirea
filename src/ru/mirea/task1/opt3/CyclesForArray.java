package ru.mirea.task1.opt3;

import java.util.Scanner;

public class CyclesForArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("For: ");
        for (int i = 0; i < len; i++)
        {
            sum += arr[i];
        }
        System.out.print(sum);
        sum = 0;
        System.out.print("\nWhile: ");
        int i = 0;
        while (i < len)
        {
            sum += arr[i];
            i++;
        }
        System.out.print(sum);
        sum = 0;
        System.out.print("\nDo While: ");
        i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < len);
        System.out.print(sum);
    }
}
