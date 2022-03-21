package tasks.classwork.day10;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyStream {

    List<String> list = Arrays.asList("mama", "mila", "ramy", "mama", "chisto");

    public static void main(String[] args) {
        MyStream stream = new MyStream();
        long l = stream.list.stream().filter("mama"::equals).count();
        System.out.println(l);
        stream.list.forEach(System.out::println);
    }
}
