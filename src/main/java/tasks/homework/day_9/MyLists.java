package tasks.homework.day_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyLists {

    public static void figures() throws IOException {
        int counter = 0;
        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("figures.txt"));
        for (String s : figures) {
            writer.write(" - " + s);
            if (!s.contains("и")) {
                counter++;
            }
        }
        writer.close();

        System.out.println(counter);
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();
        figures.add(3, "Треугольник");

        for (String s : figures) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void butterflies() {
        List<String> butterflies = new ArrayList<>();
        int counter = 0;
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String s : butterflies) {
            System.out.println("\"" + s + "\"");
            if (s.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String s : butterflies) {
            System.out.println(s);
        }
    }

    public static void cities() {
        List<String> cities = new ArrayList<>(Arrays.asList("Минск", "Москва", "Берлин"));
        int sum = 0;
        for (String s : cities) {
            System.out.println(s);
            sum += s.length();
        }
        System.out.println(sum);
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
    }

    public static void cars() {
        Set<String> cars = new HashSet<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));
        List<String> list = new ArrayList<>();
        for (String s : cars) {
            System.out.println("\"" + s + "\"");
            if (s.length() > 4) {
                list.add(s);
            }
        }
        for (String s : list) {
            cars.remove(s);
        }
        for (String s : cars) {
            System.out.println(s);
        }
    }

    public static void countries() {
        List<String> countries = new ArrayList<>();
        int counter = 0;
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        for (String s : countries) {
            System.out.print(s + ", ");
            if (s.length() < 7) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
