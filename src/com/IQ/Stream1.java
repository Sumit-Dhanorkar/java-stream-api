package com.IQ;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args){
        List<Integer> list = List.of(10,1,2,3,4,56);
        List<Integer> list0 = Arrays.asList(10,1,2,3,4,56);
        list.stream().filter(x -> x%2 == 0).collect(Collectors.toList()).forEach(System.out :: println);

        List<Integer> list11 = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println("Even Nos."+list11);

        String name[]={"abc","gfsdg","grere","er4er4"};
        Stream<String> a = Stream.of("abc","gfsdg","grere","er4er4");
        a.forEach(x -> System.out.println(x));

        Stream<String> stream = Arrays.stream(name);


    }
}
