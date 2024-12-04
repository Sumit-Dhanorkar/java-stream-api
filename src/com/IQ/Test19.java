package com.IQ;

import java.util.stream.IntStream;

//19) How do you find sum of first 10 natural numbers?
public class Test19 {
    public static void main(String args[]){

        Integer q = IntStream.range(1,11).sum();
        System.out.println("q "+q);


        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);

        Integer A = IntStream.range(1,11).sum();
        System.out.println("Sum of first 10 natural numbers are "+A);

    }
}
