package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Vasya", 13, Person.Sex.MAN), new Person("Katya", 28, Person.Sex.WOMEN), new Person("Vova", 24, Person.Sex.MAN), new Person("Masha", 38, Person.Sex.WOMEN), new Person("Roman Petrovich", 72, Person.Sex.MAN));
        long counter = 0;
        for (Person person : people) {
            if((person.sex == Person.Sex.MAN && person.age > 17 && person.age < 61) || (person.sex == Person.Sex.WOMEN && person.age > 17 && person.age < 56)) {
                counter ++;
            }
        }
        counter = people.stream().filter(person -> (person.age > 17 && person.age < 56) || (person.sex == Person.Sex.MAN && person.age > 17 && person.age < 60)).count();
        counter = people.stream().filter(person -> person.age > 17).filter(person -> (person.age < 55) || (person.sex == Person.Sex.MAN && person.age < 60)).count();
        System.out.println(counter);
    }
}
