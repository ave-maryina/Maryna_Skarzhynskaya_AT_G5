package tasks.homework.day10;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
        list.stream().forEach(System.out::println);
        double sum = list.stream().mapToDouble(x -> x * 2.54).sum();
        System.out.println(sum);
    }
}
