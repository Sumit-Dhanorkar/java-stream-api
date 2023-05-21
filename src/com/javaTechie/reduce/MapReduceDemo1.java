package com.javaTechie.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,3,4,5,6,3,9);

        List<String> words=Arrays.asList("corejava","spring","hibernet");




        int sum = numbers.stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum);

        int reduceSum=numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(reduceSum);

//        int add=0;//initial  value

        Optional<Integer> reduceSum1 = numbers.stream().reduce(Integer::sum);


        System.out.println(reduceSum1.get());

        Integer mulRes=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(mulRes);

        Integer maxValue=numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(maxValue);

        Integer maxValue1=numbers.stream().reduce(Integer::max).get();

        System.out.println(maxValue1);


        //longest string

        String ans=words.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();

        System.out.println(ans);

        //get employee whose grade A

        double avgsal = EmployeeDatabase.getEmployeess().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(avgsal);


        double sumofsal = EmployeeDatabase.getEmployeess().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumofsal);






    }
}
