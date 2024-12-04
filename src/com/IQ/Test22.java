package com.IQ;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//22) How do you find the most repeated element in an array?
public class Test22 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map.Entry<String, Long> stringLongEntry3 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("q "+stringLongEntry3);

        Map<String,Long>a11 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("a11 "+a11);



        List<Map.Entry<String, Long>> collect1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect1);
        Map.Entry<String, Long> stringLongEntry2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry2);
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry1 = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry1);

        Map<String, Long> repeatativeList = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(repeatativeList);
        Map.Entry<String, Long> stringLongEntry = repeatativeList.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry.getKey()+" : "+stringLongEntry.getValue());


    }
}
