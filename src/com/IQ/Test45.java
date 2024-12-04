package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Counting Elements - numbers of occurrences of each string in the list
public class Test45 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C++","Java", "HTML", "Kotlin", "C++", "COBOL", "Java");
        Map<String, Long> collect = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
