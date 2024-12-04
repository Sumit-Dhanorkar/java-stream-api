package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Flat Mapping - make a single list
public class Test44 {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> collect1 = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println("q "+collect1);

        List<Integer> collect = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
