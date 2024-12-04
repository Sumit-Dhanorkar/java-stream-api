package com.IQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//30) First 10 odd numbers
public class Test30 {
    public static void main(String[] args) {

        IntStream.range(0,10).map(x->x*2+1).forEach(System.out::println);
        IntStream.range(1,50).filter(x->x%2!=0).limit(10).forEach(System.out::println);

        System.out.println("---Using map---");
        IntStream.range(0, 10).map(x -> (x*2)+1 ).forEach(System.out::println);

        System.out.println("---Using filter---");
        IntStream.range(1,50).filter(y -> y%2 !=0).limit(10).forEach(System.out::println);

    }
}
