package com.sumit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {

		List<Integer> numbeList=Arrays.asList(2,3,4,5,6);
		
		List<Integer> res=new ArrayList<>();
		
		for(Integer n:numbeList) {
			res.add(n*2);
		}
		
		System.out.println(res);
		
		res=numbeList.stream().map(n->n*3).collect(Collectors.toList());
		
		System.out.println(res);
		
		numbeList.stream().map(n->n*2).forEach(System.out::println);
	}
}
