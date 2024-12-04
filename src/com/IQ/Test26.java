package com.IQ;

import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//26) Print duplicate characters in a string?
public class Test26 {
    public static void main(String[] args){
        String inputString11 = "Java Concept Of The Day".replaceAll("\\s","");
        HashSet<String> d =new HashSet<>();
        String inputString18 = "Java Concept Of The Day";
        List<Map.Entry<String, Long>> collect2 = Stream.of(inputString18.replace(" ", "").toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println("s"+collect2);

        Set<String> collect1 = Arrays.stream(inputString18.toLowerCase().replace(" ","").split("")).filter(x -> !d.add(x)).collect(Collectors.toSet());
        System.out.println("s"+collect1);

        HashSet<String>s11 = new HashSet<>();
        Set<String> collect = Arrays.stream(inputString11.toLowerCase().split("")).filter(x -> !s11.add(x)).collect(Collectors.toSet());
        System.out.println(collect);


        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        HashSet<String> hashSet=new HashSet<>();
        Set<String> set = Arrays.stream(inputString.split("")).filter(x -> !hashSet.add(x)).collect(Collectors.toSet());
        System.out.println(set);

    }
}
