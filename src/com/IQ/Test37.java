package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//GroupinBy Muliple conditions(Length & ist Character)
public class Test37 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("explained", "through", "arm","apple","bee","bye","Paper","head");
        Map<Integer, Map<Character, List<String>>> collect1 = list.stream().collect(Collectors.groupingBy(String::length, Collectors.groupingBy(x -> x.charAt(0), Collectors.toList())));
        System.out.println("q "+collect1);
        Map<Integer, Map<Character, List<String>>> collect = list.stream().collect(Collectors.groupingBy(String::length, Collectors.groupingBy(s -> s.charAt(0))));
        System.out.println(collect);
    }
}
