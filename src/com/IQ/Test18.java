package com.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//18) Reverse each word of a string using Java 8 streams?
public class Test18 {
    public static void main(String[] args){
        String str0 = "Java";

        String s1 = new StringBuffer(str0).reverse().toString();
        System.out.println("q= "+s1);

        String s = new StringBuilder(str0).reverse().toString();
        System.out.println(s);
        //////////////Reverse each word of a string and that sentence also

        String str = "Java Concept Of The Day";

        String collect = Stream.of(str.split(" ")).map(x -> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
        System.out.println("q = "+collect);
        String list0 = new StringBuilder(str).reverse().toString();
        System.out.println(list0);


       //////////////Reverse each word of a string

        String list = Arrays.stream(str.split(" ")).map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(list);

        List<String> str1 = Arrays.asList("Java", "Concept", "Of", "The", "Day");
        List<String> list1 = str1.stream().map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList());
        System.out.println(list1);

    }
}
