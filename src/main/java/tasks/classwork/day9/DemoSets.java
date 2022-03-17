package tasks.classwork.day9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSets {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        long l0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            hashSet.add("ha");
        }
        System.out.println(System.currentTimeMillis() - l0);

        l0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            treeSet.add("ho");
        }
        System.out.println(System.currentTimeMillis() - l0);

    }
}
