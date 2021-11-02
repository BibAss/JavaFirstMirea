package ru.mirea.task10;

import java.util.Scanner;

public class opt8 {
    private static Scanner sc;
    private static int  i;
    private static int j;
    private static boolean b;

    public static void main(String[] args) {
        System.out.println("Enter the word");
        sc = new Scanner(System.in);
        String word = sc.nextLine();
        i = 0;
        j = word.length() - 1;
        Palindrome(word);
        if(b == true) {System.out.println("YES");}
        else {System.out.println("NO");}
    }

    public static void Palindrome(String w)
    {
        if(w.charAt(i) == w.charAt(j))
        {
            i++;
            j--;
            if(i >= j)
            {
                b = true;
                return;
            }
            Palindrome(w);
        }
        else
        {
            b = false;
            return;
        }
    }
}
