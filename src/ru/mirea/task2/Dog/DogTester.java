package ru.mirea.task2.Dog;
import java.util.ArrayList;
public class DogTester {
    public static void main(String[] args) {
        ArrayList dogs = new ArrayList(5);
        dogs.add(new Dog("Бобик", 2));
        dogs.add(new Dog("Рафик", 4));
        dogs.add(new Dog("Толик", 1));
        dogs.add(new Dog("Додик", 6));
        System.out.println(dogs.toString());
    }
}
