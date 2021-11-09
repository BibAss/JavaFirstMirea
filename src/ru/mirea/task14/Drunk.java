package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;

public class Drunk {
    static Scanner sc = new Scanner(System.in);
    static Stack<Integer> first = new Stack<Integer>();
    static Stack<Integer> second = new Stack<Integer>();

    public static void main(String[] args) {
        Reader(first);
        first = Reverse(first);
        Reader(second);
        second = Reverse(second);
        Game(first, second);
    }

    public static Stack<Integer> AddToEnd(Stack<Integer> rd, int card)
    {
        Stack<Integer> buff = new Stack<Integer>();
        int size = rd.size();
        for(int i = 0; i < size; i++)
        {
            buff.push(rd.pop());
        }
        buff.push(card);
        buff = Reverse(buff);
        return buff;
    }

    public static Stack<Integer> Reverse(Stack<Integer> rd)
    {
        Stack<Integer> buff = new Stack<Integer>();
        int size = rd.size();
        for(int i = 0; i < size; i++)
        {
            buff.push(rd.pop());
        }
        return buff;
    }
    public static void Reader(Stack<Integer> rd)
    {
        for(int i = 0; i < 5; i++)
        {
            rd.push(sc.nextInt());
        }
    }

    public static void Game(Stack<Integer> f, Stack<Integer> s)
    {
        int counter = 0;
        int first_card = 0;
        int second_card = 0;
        while((f.empty() != true) && (s.empty() != true))
        {
            first_card = f.pop();
            second_card = s.pop();
            if(first_card < second_card)
            {
                s = AddToEnd(s, first_card);
                s = AddToEnd(s, second_card);
            }
            else if(second_card < first_card)
            {
                f = AddToEnd(f, first_card);
                f = AddToEnd(f, second_card);
            }
            else if(second_card == first_card)
            {
                f = AddToEnd(f, first_card);
                s = AddToEnd(s, second_card);
            }
            counter++;
            if(counter == 106)
            {
                System.out.println("botva");
                return;
            }
        }
        if(f.empty())
        {
            StringBuilder build = new StringBuilder();
            System.out.println("second " + build.append(counter).toString());
        }else {
            StringBuilder build = new StringBuilder();
            System.out.println("first " + build.append(counter).toString());
        }

    }
}
