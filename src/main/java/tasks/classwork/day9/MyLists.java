package tasks.classwork.day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLists {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        long l0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add("ha");

        }
        System.out.println(System.currentTimeMillis() - l0);

        l0 = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add("ho");
        }
        System.out.println(System.currentTimeMillis()- l0);

    }
}
