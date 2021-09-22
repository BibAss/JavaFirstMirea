package ru.mirea.task1.opt6;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        System.out.println("Unsorted array:");
        int[] arr = new int [1 + (int)(Math.random() * 10)];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted array:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
