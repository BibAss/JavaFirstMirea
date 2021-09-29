package ru.mirea.task5.Furniture;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture bed = new Bed("Alaska", 1000, 2500);
        Furniture kitchen = new Kitchen("USA", 100, 10000);
        Furniture chair = new Chair("Russia", 500, 150);

        System.out.println(bed);
        System.out.println(kitchen);
        System.out.println(chair);

        Bed classic = new Bed("Malaysia", 0, 500);
        classic.isSold();

        Kitchen royal = new Kitchen("China", 50, 6000);
        royal.sale(70);

        System.out.println(classic);
        System.out.println(royal);
    }
}
