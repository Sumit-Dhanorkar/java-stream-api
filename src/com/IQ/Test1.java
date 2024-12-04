package com.IQ;

import java.util.*;
import java.util.stream.Collectors;

//1) Given a list of integers, separate odd and even numbers?
public class Test1 {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(33,11,2,3,4,5,6,7,18,19,88,54,43,65,22,67,89,07);
        List<Integer> list1 = Arrays.asList(11,2,3,4,5,6,7,18,19,88,54,43,65,22);

        Map<String, List<Integer>>list0 = list.stream().collect(Collectors.groupingBy(x-> x%2==0?"Even":"Odd" , Collectors.toList()));
        System.out.println(list0);

        Map<Boolean,List<Integer>>list9 = list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(list9);


        //Odd Even No seperation
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Collect"+collect);

        //odd no using collectors
        var temp = list.stream().collect(Collectors.filtering(j -> j % 2 != 0, Collectors.toSet()));
        System.out.println(temp);

        var temp1 = list.parallelStream().collect(Collectors.partitioningBy(r -> r%2 == 0));
        System.out.println(temp1);

        //Equals
        boolean equals = list.equals(list1);
        System.out.println("List are equal = "+equals);

        //Contains
        boolean contains = list.contains(list1);
        System.out.println("List contains List1 = "+contains);

        //Collections.reverse
        Collections.reverse(list);
        System.out.println("Reverse the list "+list);

        //Collection.sort
        Collections.sort(list);
        System.out.println("Sorted list is " +list);

        //Collection.sort (in reverse order)
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted in reverse order list is " +list);

        //contentEquals
        //created two ArrayList firstList and secondList of String type return boolean value
        boolean b = list.toString().contentEquals(list1.toString());
        System.out.println("content equal "+b);

        //Arraylist size()
        System.out.println("List size is "+list.size());



    }
}
