package ru.mirea.task3.Human;

public class Arm extends Body{
    private double length;
    private double HandGirth;

    Arm(){}
    Arm(double len, double girth)
    {
        this.length = len;
        this.HandGirth = girth;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setHandGirth(double handGirth) {
        HandGirth = handGirth;
    }

    public double getLength() {
        return length;
    }
    public double getHandGirth() {
        return HandGirth;
    }

    @Override
    public String toString() {
        return "Arm {" +
                "length=" + length +
                ", HandGirth=" + HandGirth +
                '}';
    }
}
