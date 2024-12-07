package com.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        //Duplicate element in String
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 2, 2, 3, 4, 4, 6);

        //1. using set
        Set<Integer > set = new HashSet<>();
        Set<Integer> collect5 = list.stream()
                .filter(a -> !set.add(a))
                .collect(Collectors.toSet());

        //2. using hash


        System.out.println(collect5);
    }
}
