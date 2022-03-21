package tasks.classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramy", "mama", "chisto");
        list.stream().anyMatch("mama"::equals);
        list.stream().allMatch(x -> x.contains("m"));
        List<String> arrayList = list.stream().map(x -> x + "m").collect(Collectors.toList());
        list.stream().flatMap(x -> Arrays.stream(x.split("a")).filter(l -> !l.equals(""))).collect(Collectors.toList());

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList());

        List<Person> people = Arrays.asList(new Person("Vasya", 13, Person.Sex.MAN), new Person("Katya", 28, Person.Sex.WOMEN), new Person("Vova", 24, Person.Sex.MAN), new Person("Masha", 38, Person.Sex.WOMEN), new Person("Roman Petrovich", 72, Person.Sex.MAN));
        people.stream().sorted((person1, person2) -> {
            if(person1.sex != person2.sex) {
                return person1.sex.compareTo(person2.sex);
            } else {
                return person1.age - person2.age;
            }
        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList());

        people.stream().sorted((p1, p2) -> p1.sex != p2.sex ? p1.sex.compareTo(p2.sex) : p1.age - p2.age);
    }
}
