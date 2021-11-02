package ru.mirea.task10;

import java.util.Scanner;

public class opt9 {
    public static int rev(int c0, int c1) {
        if (c0 == 0)
            return 1;
        if (c1 == 0 && c0 > 1)
            return 0;
        if (c0 == 1 && c1 == 0)
            return 1;
        return (rev(c0, c1 - 1) + rev(c0 - 1, c1 - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c0 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println(rev(c0,c1));
    }
}
