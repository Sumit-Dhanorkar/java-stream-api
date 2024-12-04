package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//15) Given a list of strings, sort them according to increasing order of their length?
public class Test15 {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#","HTMD", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> collect = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println("a "+collect);

        List<String> collect1 = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(collect1);

        Map<String, Integer> collect2 = listOfStrings.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(collect2);

        List<String> A = listOfStrings.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println("list of strings according to alphabatical order "+A);
        List<String> B = listOfStrings.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
        System.out.println("list of strings, sort them according to increasing order of their length is "+B);
    }


//    sorted(String::compareToIgnoreCase) sorts in alphabetical order, ignoring case.
//    sorted(String::compareTo) sorts in alphabetical order, with case sensitivity.

 //Comparator.comparing(String :: length) is a shorthand for a lambda expression that takes a String argument and returns its length.
 // This means that the sorting will be based on the length of the strings.
}
