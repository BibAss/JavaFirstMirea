package ru.mirea.task3.Human;

public class Human {
    private int Age;
    private String Name;

    Human(){}

    Human(int age, String name)
    {
        this.Age = age;
        this.Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }
    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Human {" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
