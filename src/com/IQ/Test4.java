package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//4) How do you find frequency of each element in an array or a list?
public class Test4 {

    public static void main(String[] args) {

        int a[] = {1,1,2,11,42,34,44,11,2,75,87,3};
        Map<Integer,Long>a2 = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("a2"+a2);

        Map<Integer,Long>a11=Arrays.stream(a).boxed().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println("a11 "+a11);

        Map<Integer,Long>a1=Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(a1);

        Map<Integer,Long> frequency11 =Arrays.stream(a).mapToObj(x ->x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer,Long> frequency = Arrays.stream(a).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("Frequency11 of each element in an array"+frequency11);
        System.out.println("Frequency of each element in an array"+frequency);


        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String, Long>frequency1 = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of each element in List"+frequency1);

        Map<Integer,Long> frequency2 = Arrays.asList(1,1,2,11,42,34,44,11,2,75,87,3).stream().collect(Collectors.groupingBy(u->u,Collectors.counting()));
        System.out.println("Frequency of each element in List"+frequency2);

        //In this case When you call stream() on this list, you get a Stream<int[]>
        //The resulting Map will have the int[] arrays as keys, and the count of each array as values.
        Map<int[],Long> frequency3 = Arrays.asList(a).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of each element in List"+frequency3);
    }
}
