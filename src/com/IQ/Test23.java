package com.IQ;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//23) Palindrome program using Java 8 streams
public class Test23 {
    public static void main(String[] args){
        String str = "TOTAMATOT";

        boolean b2 = IntStream.range(1, str.length()).noneMatch(x -> str.charAt(x) != str.charAt(str.length() - x - 1));


        boolean b1 = IntStream.range(1, str.length()).noneMatch(x -> str.charAt(x) != str.charAt(str.length() - x - 1));
        if(b1){
            System.out.println("pallindrom");
        }else {
            System.out.println("not pallindrom");
        }


        //IntStream.range(1,str.length()).noneMatch(i->str.charAt(i)!)
        boolean b = IntStream.range(1, str.length()).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        System.out.println(b);

        boolean isItPalindrome = IntStream.range(1, str.length()).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i-1));
        if (isItPalindrome)
        System.out.println(str+" is a palindrome");
        else
        System.out.println(str+" is not a palindrome");
    }
}
