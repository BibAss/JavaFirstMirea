package ru.mirea.task12;

import java.util.Arrays;

public class opt1 {
    static class Student {
        private int id;

        Student() {
            this.id = (int) (Math.random() * 100);
        }

        Student(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + this.id +
                    '}';
        }

        public int getId() {
            return this.id;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            System.out.print(students[i].getId() + " ");
        }

        for (int i = 0; i < 20; i++) {
            Student temp = students[i];
            int j = i - 1;
            for ( ; j >= 0; j--)
                if (temp.getId() < students[j].getId())
                    students[j + 1] = students[j];
                else break;
            students[j + 1] = temp;
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(students[i].getId() + " ");
        }

    }
}