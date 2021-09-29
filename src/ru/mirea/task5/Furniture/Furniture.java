package ru.mirea.task5.Furniture;

public abstract class Furniture {
    private String Country;
    private int Count;
    private double Price;

    Furniture(String country, int count, double price)
    {
        this.Country = country;
        this.Count = count;
        this.Price = price;
    }
    public abstract String getType();

    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {

        this.Country = country;
    }

    public int getCount() {
        return Count;
    }
    public void setCount(int count) {
        this.Count = count;
    }

    public double getPrice() {
        return Price;
    }
    public void setPrice(double price){
        this.Price = price;
    }
    public void sale(int percent){
        this.Price = this.Price * (100 - percent) / 100;
    }

    public boolean isSold(){
        return this.Count == 0;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + this.getType() + '\'' +
                ", country='" + this.getCountry() + '\'' +
                ", count=" + this.getCount() +
                ", price=" + this.getPrice() +
                '}';
    }
}
