package ru.mirea.task13;

import java.util.Arrays;
import java.util.LinkedList;

public class opt2 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        String ferrari ="Ferrari 360 Spider";
        String bugatti = "Bugatti Veyron";
        String lambo = "Lamborghini Diablo";

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        String[] carsArray = cars.toArray(new String[3]);
        System.out.println(Arrays.toString(carsArray));

        cars.add("ferrari");
        cars.add("bugatti");
        cars.add("lambo");
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
        cars.addFirst("ford");
        cars.addLast("fiat");
        System.out.println(cars);
    }
}
