package tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String[] array = "mama mila ramu mila".split(" ");
//        list.addAll(List.of(s.split(" ")));
//        for (String st : list) {
//            System.out.println(st);
//        }

        for (String st : array) {
            list.add(st);
        }

        for(String str : list) {
            System.out.println(str);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
