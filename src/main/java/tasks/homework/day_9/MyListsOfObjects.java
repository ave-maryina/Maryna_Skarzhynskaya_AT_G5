package tasks.homework.day_9;

import tasks.homework.day_9.classes.*;

import java.util.*;

public class MyListsOfObjects {

    public static void bubbles() {
        int sumVolumes = 0;
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
            sumVolumes += bubble.getVolume();
        }
        System.out.println();
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();
        System.out.println("Sum of volumes: " + sumVolumes);
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }

    public static void people() {
        List<Person> people = Arrays.asList(new Person(32, "Коля"), new Person(24, "Оля"), new Person(55, "Вася"), new Person(63, "Маша"));
        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();
        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }

    public static void water() {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Амиачный"));
        for (Water w : water) {
            System.out.println(w.getColor() + " - вода");
        }
    }

    public static void sand() {
        List<Sand> sandBox = Arrays.asList(new Sand(2, "Речной"), new Sand(4, "Речной"), new Sand(2, "Карьерный"), new Sand(7, "" +
                "Речной"));
        Map<Integer, Sand> sandMap = new HashMap<>();
        for (Sand sand : sandBox) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();
        for (Sand sand : sandBox) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();
        for (int i = 0; i < sandBox.size(); i++) {
            sandMap.put(i, sandBox.get(i));
        }
        for (Integer i : sandMap.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Sand sand : sandMap.values()) {
            System.out.println(sand.toString() );
        }
        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void furniture() {
        List<Chair> furniture = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));
        Map<Integer, Chair> chairMap = new HashMap<>();
        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }
        System.out.println();
        for(int i = 0; i < furniture.size(); i ++) {
            chairMap.put(i, furniture.get(i));
        }
        for (Integer i : chairMap.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Chair chair : chairMap.values()) {
            System.out.println(chair.toString());
        }
        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
