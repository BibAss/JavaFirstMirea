package ru.mirea.task13;

import java.util.ArrayList;

public class opt1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.toString());
        list.add("13");
        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println(list2.toString());
        list2.add("bad");
        list2.add("number");
        System.out.println(list2.toString());
        ArrayList<String> list3 = new ArrayList<>(20);
        list3.add("arr");
        System.out.println(list3.toString());
        ArrayList<String> list4 = new ArrayList<>(10000); // так и не понял ппочему не увеличился размер
        System.out.println(list4.size()); // выводит 0 почему-то
        System.out.println("_______________");

        ArrayList <String> listik = (ArrayList<String>) list.clone();
        list.clear();
        for(int i = 0; i < list.size(); i++)
        {
            list.add(String.valueOf(Math.random() * 100));
        }
        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(listik);
        System.out.println("Первое добавление: " + secondList);
        secondList.addAll(list2);
        System.out.println("Второе добавление: " + secondList);
        if (secondList.contains("bad"))
        {
            System.out.println("есть bad");
        }
    }
}
