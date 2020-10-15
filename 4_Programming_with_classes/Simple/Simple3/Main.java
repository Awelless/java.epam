package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Student[] students = new Student[] {
            new Student("Иванов И.И.",    53501, new int[] {9, 10, 9, 8, 9}),
            new Student("Гослинг Р.Т.",   53503, new int[] {10, 10, 10, 10, 10}),
            new Student("Рудаков А.Д.",   53505, new int[] {10, 10, 10, 10, 10}),
            new Student("Пралат П.С.",    53504, new int[] {7, 8, 10, 8, 9}),
            new Student("Кобейн К.Д.",    53506, new int[] {2, 3, 2, 4, 2}),
            new Student("Машина А.М.",    53505, new int[] {10, 10, 10, 10, 7}),
            new Student("Анимешный А.С.", 53505, new int[] {9, 9, 10, 10, 9}),
            new Student("Шилов Г.С.",     53502, new int[] {8, 9, 7, 4, 7}),
            new Student("Епамов Г.Д.",    53506, new int[] {9, 7, 9, 8, 9}),
            new Student("Тестовый Т.Т.",  53504, new int[] {7, 8, 10, 7, 9})
        };

        for(Student currentStudent : students) {

            if(currentStudent.isExcellent()) {
                currentStudent.print();
            }
        }
    }
}
