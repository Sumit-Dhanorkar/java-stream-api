package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Finding Max & Min
public class Test42 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max "+max);
        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min "+min);

    }
}
