package com.medium;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        findDuplicates(List.of("sumit","amit","sumit","amit","samit","radg"));
    }

    public static void findDuplicates(List<String> list){
        //find just duplicated
        Set<String > set = new HashSet<>();
        Set<String> ans = list.stream()
                .filter((str) -> !set.add(str)).collect(Collectors.toSet());

        //how many time name is repeated. (groupingBy)

        Map<String, Long> duplicates =
                list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<String> dup2 = duplicates.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("ans: -> "+dup2);

        //using Collections.frequency() method.
        Set<String> ans3 = list.stream()
                .filter(name -> Collections.frequency(list, name) > 1)
                .collect(Collectors.toSet());
        System.out.println("ans3: -> "+ans3);



    }
}
