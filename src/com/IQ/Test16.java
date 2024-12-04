package com.IQ;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//16) Given an integer array, find sum and average of all elements?
public class Test16 {

    public static void main(String[] args){
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        Integer collect2 = Arrays.stream(a).boxed().collect(Collectors.summingInt(x -> x));
        System.out.println("q "+collect2);
        Double collect3 = Arrays.stream(a).boxed().collect(Collectors.averagingInt(x -> x));
        System.out.println("r "+collect3);

        int sum2 = Arrays.stream(a).sum();
        OptionalDouble average2 = Arrays.stream(a).average();

        IntSummaryStatistics collect1 = Arrays.stream(a).boxed().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect1);
        int sum1 = Arrays.stream(a).sum();
        OptionalDouble average1 = Arrays.stream(a).average();
        System.out.println("Sum "+sum1+" Average "+average1);


        DoubleSummaryStatistics collect = Arrays.stream(a).boxed().collect(Collectors.summarizingDouble(x -> x));
        System.out.println(collect.getAverage()+" "+collect.getSum());


        Double average = Arrays.stream(a).average().getAsDouble();
        Integer sum = Arrays.stream(a).sum();
        System.out.println("Sum is "+sum+" Average is "+average);
    }
}
