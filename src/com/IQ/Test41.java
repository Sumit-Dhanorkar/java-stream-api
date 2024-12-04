package com.IQ;

import java.util.Arrays;
import java.util.List;

//Reducing to product
public class Test41 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce2 = list.stream().reduce(1, (a, b) -> a * b);
        Integer reduce = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        Integer reduce1 = list.stream().reduce(1, Math::multiplyExact);
        System.out.println(reduce1);
    }
}
