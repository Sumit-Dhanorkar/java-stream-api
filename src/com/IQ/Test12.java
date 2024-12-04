package com.IQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//12) Java 8 program to check if two strings are anagrams or not?
public class Test12 {
    public static void main(String[] args){
        String s1 = "RaceCar";
        String s2 = "CarRace";

        List<String> collect6 = Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.toList());
        List<String> collect7 = Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.toList());
        System.out.println("1 "+collect6);
        System.out.println("2 "+collect7);
        if(collect6.equals(collect7)){
            System.out.println("two strings are anagrams");
        }else{
            System.out.println("two strings are not anagrams");
        }

//Compares the unicode
        List<Integer> collect = s1.chars().boxed().sorted().collect(Collectors.toList());
        List<Integer> collect1 = s2.chars().boxed().sorted().collect(Collectors.toList());
        System.out.println("11 "+collect);
        System.out.println("12 "+collect1);

        if(collect.equals(collect1)){
            System.out.println("strings are anagrams1");
        }else{
            System.out.println("strings are not anagrams1");
        }
        List<String> collect4 = Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.toList());
        System.out.println(collect4);

        List<String> collect5 = Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.toList());
        System.out.println(collect5);
        if(collect4.equals(collect5)){
            System.out.println("strings are anagrams");
        }else{
            System.out.println("strings are not anagrams");
        }



        List<String> collect2 = Stream.of(s1.split("")).map(x -> x.toUpperCase()).sorted().collect(Collectors.toList());
        List<String> collect3 = Stream.of(s2.split("")).map(x -> x.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("1 "+collect2+" 2 "+collect3);
        if (collect2.equals(collect3)) {
            System.out.println("Two strings are anagrams");
        }else{
            System.out.println("Two strings are not anagrams");
        }


        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(s1.equals(s2)){
            System.out.println("Two strings are anagrams");
        }else{
            System.out.println("Two strings are not anagrams");
        }


    }
}
