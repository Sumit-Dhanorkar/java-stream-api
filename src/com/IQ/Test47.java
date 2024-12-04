package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the longest string in a list of strings using Java streams
public class Test47 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        Map.Entry<String, Integer> stringIntegerEntry = strings.stream().collect(Collectors.toMap(x -> x, String::length)).entrySet().stream().max((Map.Entry.comparingByValue())).get();
        System.out.println(stringIntegerEntry);
    }
}
