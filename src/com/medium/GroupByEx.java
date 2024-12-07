package com.medium;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    int id;
    String name;
    int age;
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

public class GroupByEx {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"sumit",32),
                new Employee(2,"amit",35),
                new Employee(3,"shubham",38),
                new Employee(4,"shyam",28),
                new Employee(5,"sumit",30)
        );
        //segrigate emp by age

        Map<Integer, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        Map<Integer, Set<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.toSet()));

        Map<Integer, Set<Employee>> collect2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toSet()));

//        System.out.println(collect2);

        //min age emp in org and find average age of employee
        //this summary statistics can be only applied to the integer stream.
        IntSummaryStatistics summaryStatistics = employees.stream()
                .map(Employee::getAge)
                .mapToInt(x -> x)
                .summaryStatistics();

        int max = summaryStatistics.getMax();
        int min = summaryStatistics.getMin();
        System.out.println("max: " + max + ", min: " + min);

        //given array give slice of it

        //find second youngest and third youngest emp in org
        Stream<Integer> integerStream = employees.stream().map(Employee::getAge);
        List<Integer> collect3 = integerStream.sorted().collect(Collectors.toList());
        List<Integer> slice = collect3.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(slice);

        String collect4 = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(",  "));

        System.out.println(collect4);

        //duplicates in list.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 3, 2, 2, 3, 4, 4, 6);

        //1. using set
        Set<Integer > set = new HashSet<>();
        Set<Integer> collect53 = list1.stream()
                .filter(a -> !set.add(a))
                .collect(Collectors.toSet());

        /*
            Collectors.groupingBy -> creates the key value pair (map).
            public static <T, K> Collector<T, ?, Map<K, List<T>>>
                groupingBy(Function<? super T, ? extends K> classifier) {
                    return groupingBy(classifier, toList());
             }

             if we see above parameter
             Function- >
             each and every element which comes to this grouping by applies
             the function on the input and makes it as key and second argument
             as what type of output we need to get.

         */

        Function.identity(); // returns what it gets

        List<String> collect5 = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        //using Collections.frequency()
        List<String> list = employees.stream().map(Employee::getName).collect(Collectors.toList());
        Set<String> collect6 = list.stream()
                .filter(name -> Collections.frequency(list, name) > 1)
                .collect(Collectors.toSet());



        System.out.println(collect6);

    }
}
