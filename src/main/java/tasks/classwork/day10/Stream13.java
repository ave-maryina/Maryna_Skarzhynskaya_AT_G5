package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream13 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramy", "mama", "chisto");
        List<Person> people = Arrays.asList(new Person("Vasya", 13, Person.Sex.MAN), new Person("Katya", 28, Person.Sex.WOMEN), new Person("Vova", 24, Person.Sex.MAN), new Person("Masha", 38, Person.Sex.WOMEN), new Person("Roman Petrovich", 72, Person.Sex.MAN));
        list.stream().collect(Collectors.joining(":", "<p>", "/p"));
        people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p));
        people.stream().collect(Collectors.groupingBy(person -> person.sex)).keySet().forEach(System.out::println);
    }
}
