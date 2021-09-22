package ru.mirea.task2.Dog;

public class Dog {
    private String NickName;
    private int Age;

    Dog(String nickName, int age)
    {
        this.setNickName(nickName);
        this.setAge(age);
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }
    public void setAge(int age) {
        Age = age;
    }

    public String getNickName() {
        return NickName;
    }
    public int getAge() {
        return Age;
    }

    public int getAgeOnHumans()
    {
        return Age * 7;
    }

    @Override
    public String toString() {
        return "\n" + "Кличка = " + NickName + "; "  + "Возраст = " + Age + "; " + "Возраст собаки в человеческих годах = " + getAgeOnHumans();
    }
}
