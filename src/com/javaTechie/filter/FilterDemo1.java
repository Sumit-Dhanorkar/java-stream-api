package com.sumit.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> numList=new ArrayList<>();
		
		numList.add(12);
		numList.add(23);
		numList.add(34);
		numList.add(354);
		numList.add(6); */
		
		
		List<Integer> numberList = Arrays.asList(12,23,45,56,54,32,12);
		
		
		List<Integer> evenNumberList=new ArrayList<>();
		
		//without using stream
		
//		for(int n:numberList) {
//			if(n%2==0) {
//				evenNumberList.add(n);
//			}
//		}
//		
//		System.out.println(evenNumberList);
		
		//using stream
		
//		evenNumberList =numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
//		
//		System.out.println(evenNumberList);
		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("---------------------------------------------");
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);

		

	}
}
