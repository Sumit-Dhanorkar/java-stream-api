package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
public class Test11 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> s11 = list.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        System.out.println("Min Order "+s11);

        List<Integer> s12 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("Max Order "+s12);

        List<Integer> a = list.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        List<Integer> a1 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("min "+a+" max "+a1);


        List<Integer> A0= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> A1= list.stream().sorted().collect(Collectors.toList());
        List<Integer> A2= list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        List<Integer> A3= list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(A0);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

    }
}
