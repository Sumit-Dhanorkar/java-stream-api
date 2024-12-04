package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Reducing to a Sum
public class Test40 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        int sum = IntStream.rangeClosed(1, list.size()).sum();
        System.out.println(sum);
    }
}
