package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//To group string of the same length using java8
//Basic grouping by string length
public class Test33 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("explained", "through", "arms","apple","hii","bye","Paper","head");

        Map<Integer, List<String>> collect1 = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println("q "+collect1);
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println(collect);


    }
}
