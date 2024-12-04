package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//24) Given a list of strings, find out those strings which start with a number?
public class Test24 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        List<String> collect = list.stream().filter(x -> Character.isDigit(x.charAt(0))).collect(Collectors.toList());
        System.out.println("digit"+collect);

        list.stream().filter(x->Character.isDigit(x.charAt(0))).forEach(System.out::println);
        list.stream().filter(x -> Character.isDigit(x.charAt(0))).forEach(System.out::println);
    }
}
