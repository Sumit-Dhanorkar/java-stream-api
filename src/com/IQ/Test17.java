package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//17) How do you find common elements between two arrays?
public class Test17 {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        List<Integer> collect1 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("q "+collect1);

        List<Integer>a11= list1.stream().filter(x->list2.contains(x)).collect(Collectors.toList());
        System.out.println("a11 "+a11);


        List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer>list = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("Common elements between two arrays is "+list);
    }
}
