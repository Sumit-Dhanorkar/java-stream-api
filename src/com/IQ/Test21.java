package com.IQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//21) Print first 10 even numbers
public class Test21 {
    public static void main(String args[]){

        List<Integer> a = IntStream.range(1,11).map(x->x*2).boxed().collect(Collectors.toList());
        System.out.println("q "+a);

        List<Integer> collect = IntStream.range(1, 11).map(x -> x * 2).boxed().collect(Collectors.toList());
        System.out.println(collect);
        IntStream.range(1,11).map(x->x*2).forEach(System.out::println);

        IntStream.range(1, 10).map(x -> x * 2).forEach(System.out :: println);
    }
}

