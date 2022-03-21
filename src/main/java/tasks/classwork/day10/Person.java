package tasks.classwork.day10;

import java.util.Objects;

public class Person {

    public int age;
    public String name;
    public Sex sex;

    public Person(String name, int age, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public enum Sex {
        MAN, WOMEN
    }
}
