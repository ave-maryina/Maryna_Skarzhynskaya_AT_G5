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
        boolean isFirst = true;
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        for (String s : countries) {
            if (isFirst) {
                System.out.print(s);
                isFirst = false;
            } else {
                System.out.print(", " + s);
            }
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

    public static void birds() {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        int counterWords = 0;
        final String VOWELS = "ёуеыаоэяию";
        for (String s : birds) {
            System.out.println("--" + s + "--");
            int counterVowels = 0;
            for (char ch : VOWELS.toCharArray()) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.toLowerCase(Locale.ROOT).charAt(i) == ch) {
                        counterVowels++;
                    }
                }
            }
            if (counterVowels > 1) {
                counterWords++;
            }
        }
        System.out.println(counterWords);
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();
        birds.set(3, "Синица");
        for (String s : birds) {
            System.out.print(s + " ");
        }
    }

    public static void elements() {
        List<String> elements = new ArrayList<>();
        int counter = 0;
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");
        for (String s : elements) {
            System.out.print(s + " ");
            if (s.contains(" ") | s.contains("-")) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();
        elements.set(4, "Spinner");
        elements.remove(2);
        elements.add(5, "Switch");
        for (String s : elements) {
            System.out.print(s + " ");
        }
    }

    public static void numbers() {
        int sum = 0;
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        for (int i : numbers) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum: " + sum);
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        Collections.reverse(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void doubleNumbers() {
        double multiplication = 1;
        double sumOfFractionalParts = 0;
        List<Double> numbers = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        for (Double i : numbers) {
            System.out.print(i + " ");
            multiplication *= i;
            sumOfFractionalParts += i%1;
        }
        System.out.printf("Multiplication: " + "%.2f", multiplication).println();
        System.out.printf("Sum Of Fractional Parts: " + "%.2f", sumOfFractionalParts).println();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i).intValue() + " ");
        }
    }

    public static void noodles() {
        List<String> noodles = Arrays.asList("Hakka", "Ramen", "Hibachi", "Schezwan");
        for (String s : noodles) {
            System.out.print(" - " + s);
        }
        System.out.println();
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i).replaceAll("a", "o") + " ");
        }
    }
}
