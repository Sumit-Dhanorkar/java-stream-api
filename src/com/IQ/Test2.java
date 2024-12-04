package com.IQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//2) How do you remove duplicate elements from a list using Java 8 streams?
public class Test2 {
    public static void main(String[] args){
        int[] a = new int[]{2,3,4,5,6,7,18,19,88,54,43,65,22};
        List<int[]> list1 = Arrays.asList(a);
        IntStream stream = Arrays.stream(a);

        List<Integer>list8 = Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
        System.out.println("list8"+list8);

        //Using distinct
        List<Integer> k = Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
        System.out.println(k);
        //Using Collectors.toSet()
        Set<Integer>k1=Arrays.stream(a).boxed().collect(Collectors.toSet());
        System.out.println(k1);
        //Using HashSet
        HashSet<Integer>k2=new HashSet<Integer>(Arrays.stream(a).boxed().collect(Collectors.toList()));
        System.out.println(k2);


        List<Integer> list = Arrays.asList(11,12,13,14,15,16,23,24,26,11,23);

        //Using distinct()
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Collect1"+collect);

        //Using set
        Set<Integer> collect2 = list.stream().collect(Collectors.toSet());
        System.out.println("Collect2"+collect2);

       //Using Hashset
        HashSet<Integer> collect3 = new HashSet<>(list);
        System.out.println("Collect3"+collect3);

    }
}
