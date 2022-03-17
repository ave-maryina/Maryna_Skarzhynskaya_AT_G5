package tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class Colors {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.add(2, "Pink");
        list.add(4, "Yellow");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.print(list.get(1) + " " + list.get(5));
    }
}
