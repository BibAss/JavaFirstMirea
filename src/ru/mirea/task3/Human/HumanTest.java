package ru.mirea.task3.Human;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(18,"Danya");
        System.out.println(human);

        Body body = new Body(1.7, 2.8);
        body.setChestGirth(10.6);
        System.out.println(body);

        Arm arm = new Arm(100, 2.6);
        arm.setLength(0.5);
        System.out.println(arm);

        Leg leg = new Leg(0.8, 42);
        System.out.println(leg);
    }
}
