package ru.mirea.task5.Dog;

public abstract class Dog {
    private String Name;
    private String Origin;

    Dog(String name, String origin)
    {
        this.Name = name;
        this.Origin = origin;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getOrigin() {
        return Origin;
    }
    public void setOrigin(String origin) {
        Origin = origin;
    }

    public abstract int YearsOfLife();

    @Override
    public String toString() {
        return "Dog {" +
                "Name='" + Name + '\'' +
                ", Origin='" + Origin + '\'' +
                ", Продолжительность жизни: " + YearsOfLife() + " лет" + '\'' +
                '}';
    }
}
