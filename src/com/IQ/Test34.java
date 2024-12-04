package com.IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Grouping numbers by even & odd
public class Test34 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, List<Integer>> collect2 = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "Even" : "Odd", Collectors.toList()));
        System.out.println("q "+collect2);

        Map<String, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "Even" : "Odd", Collectors.toList()));
        System.out.println(collect);

        Map<Boolean, List<Integer>> collect1 = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()));
        System.out.println(collect1);

    }
}
