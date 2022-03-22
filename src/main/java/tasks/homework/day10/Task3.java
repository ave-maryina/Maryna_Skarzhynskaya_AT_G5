package tasks.homework.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {
    static List<Person> people = new ArrayList<>();
    static int minAge = 15;
    static int maxAge = 30;

    public static void main(String[] args) {
        List<Person> people = IntStream.rangeClosed(1, 100).boxed().map(i -> new Person("name" + i, "surname" + i, rnd(minAge, maxAge))).collect(Collectors.toList());
        people.add(new Person("Pole", "Krot", 16));
        people.add(new Person("Anton", "Anashkin", 19));
        people.add(new Person("Zina", "Bo", 20));
        List<String> names = people.stream().filter(p -> p.getAge() < 21).peek(p -> System.out.println(p.getName() + " " + p.getAge())).
                sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)).limit(4).
        map(p -> p.getName()).collect(Collectors.toList());
        for (String name : names) {
            System.out.println(name);
        }
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
