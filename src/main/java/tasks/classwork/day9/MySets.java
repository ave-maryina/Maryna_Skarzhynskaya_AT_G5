package tasks.classwork.day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySets {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        String[] array = "mama mila ramu mila".split(" ");
        for (String s : array) {
            words.add(s);
        }
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : words) {
            System.out.println(s);
        }
    }
}
