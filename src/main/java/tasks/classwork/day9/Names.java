package tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Olya");
        names.add("Kolya");
        names.add("Anya");
        names.add("Misha");
        names.add("Dasha");

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
        names.set(2, "Olya");
        names.set(4, "Katya");

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
        names.remove("Olya");
        names.remove(3);
        for (String s : names) {
            System.out.print(s + " ");
        }
    }
}
