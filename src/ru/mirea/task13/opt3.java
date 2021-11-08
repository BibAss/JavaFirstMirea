package ru.mirea.task13;

import java.lang.reflect.Array;

public class opt3 {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<Integer>(Integer.class, 10);
        for(int i=0; i<10; i++){
            arr.add((int)(1+Math.random()*10));
        }
        System.out.println(arr.toString());

        System.out.println("Значение элемента " + arr.get(2));

        arr.set(3,10);
        System.out.println("Установка: " + arr.toString());

        arr.remove(10);
        System.out.println("Удаление элемента: " + arr.toString());
        System.out.println("Размер:  " + arr.size());
    }
}


class MyArrayList<T> {
    private final int size;
    private int actual_size = 0;
    private final T[] array;

    public MyArrayList(Class<T> c, int size){
        this.size = size;
        array = (T[]) Array.newInstance(c, size);
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return actual_size;
    }

    public void add(T item){
        int i = 0;
        while (i < size && array[i] != null){
            ++i;
        }
        if (size == i){
            System.out.println("Not enough space");
            return;
        }
        actual_size = i;

        array[i] = item;
    }

    public void set(int index, T item){
        array[index] = item;
    }

    public void remove(T item){
        int i = 0;
        while (i < size && array[i] != item){
            ++i;
        }

        if (size == i) {
            System.out.println("Item not found");
            return;
        }

        if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

        array[size - 1] = null;
        actual_size--;

    }

    @Override
    public String toString() {
        String out = "[" + array[0];
        for(int i=1; i<actual_size; i++){
            out+=", " + array[i];
        }
        out+="]";
        return out;
    }
}
