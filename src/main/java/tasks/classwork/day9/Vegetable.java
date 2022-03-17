package tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class Vegetable {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        int counter = 0;
        vegetables.add("помидор");
        vegetables.add("огурец");
        vegetables.add("кабачок");
        vegetables.add("батат");
        vegetables.add("картоха");
        for (String s : vegetables) {
            System.out.print(s + " ");
            if (s.contains("а")) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }
        System.out.println();
        vegetables.remove("огурец");
        vegetables.remove(3);
        for (String s : vegetables) {
            System.out.print(s + " ");
        }
    }
}
