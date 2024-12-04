package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class Test6 {
    public static void main(String[] a){
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collect2 = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println("a"+collect2);

        String collect1 = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println("C "+collect1);

        String a1 = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(a1);

        String collect = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println("Final joint list is"+collect);




    }
}
