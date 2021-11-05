package ru.mirea.task12;

import java.util.ArrayList;
import java.util.Comparator;

public class opt2 {
    static class Student {
        int score;

        public Student() {
            this.score = (int) (Math.random() * 100);
        }

        public Student(int id, int score) {
            this.score = score;
        }

        public int getScore() {
            return this.score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    ", score=" + this.score +
                    '}';
        }
    }

    static class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Integer.compare(b.getScore(), a.getScore());
        }

        public static void main(String[] args) {
            ArrayList<Student> studArr = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                studArr.add(new Student());
                System.out.print(studArr.get(i).getScore() + " ");
            }
            studArr.sort(new SortingStudentsByGPA());
            System.out.println();
            for (int i = 0; i < 20; i++)
                System.out.print(studArr.get(i).getScore() + " ");
        }
    }
}
