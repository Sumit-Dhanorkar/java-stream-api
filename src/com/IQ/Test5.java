package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//5) How do you sort the given list of decimals in reverse order?
public class Test5 {
    public static void main(String[] a){
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> collect = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("a"+collect);

        List<Double>d11 = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("d11 "+d11);

        List<Double> d = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(d);

        List<Double> sortedList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Double> sortedList1 = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("sorted List is"+sortedList);
        System.out.println("sorted List is"+sortedList1);

    }
}
