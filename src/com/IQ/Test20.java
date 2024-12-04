package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 20) Reverse an integer array
public class Test20 {
    public static void main(String[] args){
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] ints3 = IntStream.rangeClosed(1, array.length).map(x -> array[array.length - x]).toArray();
        System.out.println("a "+Arrays.toString(ints3));

        List<Integer> a =IntStream.rangeClosed(1,array.length).map(x->array[array.length-x]).boxed().collect(Collectors.toList());
        System.out.println("q "+a);

        int[] ints1 = IntStream.rangeClosed(1, array.length).map(x -> array[array.length - x]).toArray();

        int[] ints2 = IntStream.rangeClosed(1, array.length).map(x -> array[array.length - x]).toArray();
        System.out.println(Arrays.toString(ints2));

        int[] ints = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(ints));
    }
}
