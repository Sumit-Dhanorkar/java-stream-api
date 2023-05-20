package com.sumit.StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(2,7,1,6,9,4,3,7);
		
		List<Integer> sortedList= list1.stream().sorted().collect(Collectors.toList());
		
		System.err.println(sortedList);
		
		List<Integer> reverseSorted= list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(reverseSorted);
		
		//Strings
		
		List<String> list2=Arrays.asList("sumit","amit","sami","kami","vivke");
		
		
		List<String> sortedList2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);
		
		
		List<String> reverseSortedList2=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList2);
		
		
	}
}
