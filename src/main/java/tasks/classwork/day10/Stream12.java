package tasks.classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "mila", "ramy", "mama", "chisto");
        List<Person> people = Arrays.asList(new Person("Vasya", 13, Person.Sex.MAN), new Person("Katya", 28, Person.Sex.WOMEN), new Person("Vova", 24, Person.Sex.MAN), new Person("Masha", 38, Person.Sex.WOMEN), new Person("Roman Petrovich", 72, Person.Sex.MAN));
        list.stream().flatMap(x -> Arrays.stream(x.split(""))).peek(System.out::println).max(String::compareTo).get();
        String s = list.stream().flatMap(x -> Arrays.stream(x.split(""))).max((a, y) -> a.compareTo(y)).get();
        System.out.println(s);
        Person person = people.stream().min(Comparator.comparingInt(p -> p.age)).get();
        System.out.println(person.name);

        int u = list.stream().map(i -> i.length()).reduce((x, y) -> x + y).get();
        System.out.println(u);
        int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);
        list.stream().flatMap(j -> Arrays.stream(j.split(""))).count();

        int d = list.stream().map(st -> st.length()).collect(Collectors.summingInt(p -> p%2 == 1 ? p : 0));
        //list.stream().map(String::length).mapToInt(p -> p%2 == 1 p)



    }
}
