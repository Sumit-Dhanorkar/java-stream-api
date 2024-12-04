package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Collecting to map - map with initial letter of string
public class Test43 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("explained", "through", "arm","bee","Paper","head");
        Map<Character, String> collect2 = list.stream().collect(Collectors.toMap(x -> x.charAt(0), x -> x));
        System.out.println("q "+collect2);

        Map<Character, List<String>> collect3 = list.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.toList()));
        System.out.println("1 "+collect3);

        Map<Character, List<String>> collect = list.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.toList()));
        System.out.println(collect);

        Map<Character, String> collect1 = list.stream().collect(Collectors.toMap(x -> x.charAt(0), x -> x));
        System.out.println(collect1);
    }
}
