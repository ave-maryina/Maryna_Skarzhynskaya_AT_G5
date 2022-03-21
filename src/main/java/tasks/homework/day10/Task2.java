package tasks.homework.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {

    static int minValue = 2;
    static int maxValue = 30;
    static double n = Math.random() * 9 + 1;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <= n; i++) {
            list.add(rnd(minValue, maxValue));
        }
        list.stream().filter(x -> x%3 == 0 && x%5 == 0).forEach(System.out::println);
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
