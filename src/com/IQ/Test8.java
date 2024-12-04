package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//8) Given a list of integers, find maximum and minimum of those numbers?
public class Test8 {

    public static void main(String[] a){
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer integer7 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("int "+integer7);
        Integer integer8 = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min "+integer8);
        Integer integer3 = list.stream().sorted(Comparator.naturalOrder()).findFirst().get();
        System.out.println("min "+integer3);

        Integer integer5 = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("max "+integer5);

        Integer integer4 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer4);
        Integer integer6 = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(integer6);


        Integer integer2 = list.stream().max(Comparator.naturalOrder()).get();
        Integer integer11 = list.stream().min(Comparator.naturalOrder()).get();
        Integer integer = list.stream().max(Comparator.naturalOrder()).get();
        Integer integer1 = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("1 "+integer2+" 2 "+integer11);


        int max = list.stream().max(Comparator.naturalOrder()).get();
        int min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max element is "+max+" Min element is "+min);

    }

}
