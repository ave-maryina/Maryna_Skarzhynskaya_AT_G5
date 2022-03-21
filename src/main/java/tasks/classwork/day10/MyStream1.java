package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramy", "mama", "chisto");
        list.stream().findFirst().orElse("mama");
        list.stream().filter("mama"::equals).findFirst().get();
        list.stream().skip(4).findFirst().get();
        list.stream().skip(2).limit(2).collect(Collectors.toList());
        list.stream().filter(s -> s.contains("m")).distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}
