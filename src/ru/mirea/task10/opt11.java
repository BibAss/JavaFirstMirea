package ru.mirea.task10;

import java.util.Scanner;

public class opt11 {
    public static int Abuse(String s) { return Count(s, 0, 0); }
    public static int Count(String s, int counter, int i) {
        if (i < s.length() && !(s.charAt(i) == '0' && s.charAt(i+1) == '0')) {
            if (s.charAt(i) == '1') {
                counter++;
                i++;
            } else {
                i++;
            }
            return Count(s, counter, i);
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Abuse(s));
    }
}
