package com.IQ;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//28) Find first non-repeated character in a string?
public class Test28 {
    public static void main(String[] args){
        String inputString = "Java Concept Of The Day";
        String a = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
        System.out.println(a);


        Map<String,Long> map = Arrays.stream(inputString.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String A = map.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
        System.out.println(map);
        System.out.println(A);
    }
}
