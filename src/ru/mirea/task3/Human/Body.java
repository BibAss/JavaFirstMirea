package ru.mirea.task3.Human;

public class Body extends Human{
    private double ChestGirth;
    private  double proportionality;

    Body(){}
    Body(double girth, double prop)
    {
        this.ChestGirth = girth;
        this.proportionality = prop;
    }

    public void setChestGirth(double chestGirth) {
        this.ChestGirth = chestGirth;
    }
    public void setProportionality(double proportionality) {
        this.proportionality = proportionality;
    }

    public double getChestGirth() {
        return ChestGirth;
    }
    public double getProportionality() {
        return proportionality;
    }

    @Override
    public String toString() {
        return "Body {" +
                "ChestGirth=" + ChestGirth +
                ", proportionality=" + proportionality +
                '}';
    }
}

