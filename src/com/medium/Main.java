package com.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    static class Person{
        String name;
        int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

//        Q. Find the longest string in a list of strings using Java streams:
        Optional<String> max = strings.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(max.get());

//        Q. Calculate the average age of a list of Person objects using Java streams:
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        double ans = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println(ans);

        

    }
}
