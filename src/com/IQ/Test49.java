package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the intersection of two lists using Java streams
public class Test49 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect);
    }
}