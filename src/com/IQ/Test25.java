package com.IQ;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//25) How do you extract duplicate elements from an array?
public class Test25 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        HashSet<Integer>set = new HashSet<>();
        List<Integer> collect = list.stream().filter(x -> !set.add(x)).collect(Collectors.toList());
        System.out.println("q "+collect);

        List<Map.Entry<Integer, Long>> collect2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect2);

        HashSet<Integer>h1 = new HashSet<>();
        List<Integer> collect3 = list.stream().filter(x -> !h1.add(x)).collect(Collectors.toList());
        System.out.println(collect3);


    }


//The filter method uses the hashlist to keep track of unique elements. When an element is encountered, it's added to the hashlist
// using hashlist.add(x). If the element is already present in the hashlist, add(x) returns false, and the ! operator makes it true, so the element
// is filtered out. If the element is not present in the hashlist, add(x) returns true, and the ! operator makes it false, so the element is allowed
// to pass through.

//By using a HashSet to keep track of unique elements, the code efficiently removes duplicates from the original list.
}
