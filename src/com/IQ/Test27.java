package com.IQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//27) Find first repeated character in a string?
public class Test27 {
    public static void main(String[] args){
        String inputString = "Java Concept Of The Day";
        HashSet<String>aa=new HashSet<>();
        String s2 = Arrays.stream(inputString.toLowerCase().split("")).filter(x -> !aa.add(x)).findFirst().get();
        System.out.println(s2);

        Map.Entry<String, Long> stringLongEntry1 = Arrays.stream(inputString.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get();
        System.out.println(stringLongEntry1);


        HashSet<String>qq = new HashSet<>();
        String s1 = Arrays.stream(inputString.toLowerCase().split("")).filter(x -> !qq.add(x)).findFirst().get();
        System.out.println(s1);

        String stringLongEntry = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
        System.out.println(stringLongEntry);


//the HashSet does not maintain any particular order.
        HashSet<String>hashset=new HashSet<>();
        String s = Arrays.stream(inputString.toLowerCase().split("")).filter(x -> !hashset.add(x)).findFirst().get();
        System.out.println(s);


//the LinkedHashMap is used to preserve the insertion order, but the Map is not necessarily iterated in the same order as
// the characters appeared in the input string.
        Map<String, Long> map = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String B = map.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
        System.out.println(B);
    }
}
