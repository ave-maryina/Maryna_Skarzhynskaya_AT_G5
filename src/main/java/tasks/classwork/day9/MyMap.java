package tasks.classwork.day9;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        String[] words = "mama mila ramu mila".split(" ");
        for (int i = 0; i < words.length; i++) {
            map.put(i, words[i]);
        }

        for (int i : map.keySet()) {
            System.out.println(i);
        }

        for (String s : map.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
