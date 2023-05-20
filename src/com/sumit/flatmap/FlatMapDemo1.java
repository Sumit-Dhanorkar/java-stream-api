package com.sumit.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		
		//map
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7);
		
		
		List<Integer> list2=list1.stream().map(n-> n+10).collect(Collectors.toList());
		System.out.println(list2);
		
		//flatMap
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=Arrays.asList(4,5);
		List<Integer> l3=Arrays.asList(8,9);
		List<Integer> l4=Arrays.asList(6,4,3);
		
		List<List<Integer>> finalList=Arrays.asList(l1,l2,l3,l4);
		
		System.out.println(finalList);
		
		
		List<Integer> finalRes=finalList.stream()
										.flatMap(x->x.stream())
										.collect(Collectors.toList());
		
		System.out.println(finalRes);
		
		List<Integer> finalRes1=finalList.stream()
				.flatMap(x->x.stream().map(n->n+10))
				.collect(Collectors.toList());
		
		
		
		System.out.println(finalRes1);
		
	}

}
