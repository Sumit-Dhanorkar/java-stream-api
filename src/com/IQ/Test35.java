package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//GroupingBy First Character
public class Test35 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("accent", "bear", "arms","apple","hii","bye","Paper","head");
        Map<Character,List<String>> collect = list.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.toList()));
        System.out.println(collect);
    }
}
