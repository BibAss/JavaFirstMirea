package ru.mirea.task5.Dish;

public abstract class Dish {
    private String material;
    private String colour;

    Dish(String mat, String col)
    {
        this.material = mat;
        this.colour = col;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }
    public abstract String Verb();

    @Override
    public String toString() {
        return "Dish{" +
                ", material='" + this.getMaterial() + '\'' +
                ", colour='" + this.getColour() + '\'' +
                ", Какая функция?: " + this.Verb() +
                '}';
    }
}
