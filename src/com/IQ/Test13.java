package com.IQ;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//13) Find sum of all digits of a number in Java 8?
public class Test13 {

    public static void main(String args[]){
        int i = 15623;
        Integer collect2 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("q "+collect2);

        int sum1 = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println("s"+sum1);

        Integer a = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("a "+a);
        int sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println("Sum "+sum );



        List<String> collect1 = Stream.of(String.valueOf(i).split("")).collect(Collectors.toList());
        System.out.println(collect1);

        //Stream.of(String.valueOf(i)).split

        Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("Sum of the integer value is "+collect);
    }
}
