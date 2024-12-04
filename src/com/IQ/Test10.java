package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//10) How do you merge two unsorted arrays into single sorted array without duplicates?
public class Test10 {
    public static void main(String[] args){
        int[] a = new int[] {4, 2, 5, 1};
        int[] b = new int[] {8, 1, 9, 5};

        List<Integer> collect = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println("e"+collect);

        List<Integer> s1 = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).boxed().sorted().distinct().collect(Collectors.toList());
        System.out.println("s1 "+s1);

        int[] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println("sorted array without duplicates "+Arrays.toString(c));
    }
}
