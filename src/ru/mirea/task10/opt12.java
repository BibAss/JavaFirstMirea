package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class opt12  {
    public static void main(String[] args) throws IOException {
        odd();
    }

    public static void odd() throws IOException {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s != 0)
        {
            if(s % 2 != 0)
            {
                System.out.print(s);
            }
            odd();
        }
        else
        {
            return;
        }
    }
}
