package ru.mirea.task3.Human;

public class Leg extends Body{
    private double length;
    private int size;

    Leg(){}
    Leg(double len, int si)
    {
        this.length = len;
        this.size = si;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Leg {" +
                "length=" + length +
                ", size=" + size +
                '}';
    }
}
