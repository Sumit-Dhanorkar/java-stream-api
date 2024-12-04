package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//GroupingBy length and sorting element
public class Test36 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("explained", "through", "arms","apple","hii","bye","Paper","head");
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length, TreeMap::new,Collectors.toList()));
        System.out.println(collect);
    }
}
