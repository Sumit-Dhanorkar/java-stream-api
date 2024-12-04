package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
public class Test9 {
    public static void main(String[] args){
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        int[] ints = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println("a"+Arrays.toString(ints));

        List<Integer> q = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().boxed().collect(Collectors.toList());
        System.out.println("q"+q);

        List<Integer>a1 = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).boxed().sorted().collect(Collectors.toList());
        System.out.println(a1);

        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println("sorted array is "+ Arrays.toString(c));
    }
}
