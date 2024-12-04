package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//31) How do you get last element of an array?
public class Test31 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
        String s1 = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(s1);


        String s = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();

        System.out.println(s);
    }
}
