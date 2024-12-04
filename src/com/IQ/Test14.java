package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//14) Find second largest number in an integer array?
public class Test14 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer a = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("a "+a);
        Integer a11 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("a11 "+a11);


        Integer A = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second largest number in an integer array is "+A);
    }
}
