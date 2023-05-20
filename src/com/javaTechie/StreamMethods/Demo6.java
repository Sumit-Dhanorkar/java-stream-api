package com.sumit.StreamMethods;

import java.util.HashSet;
import java.util.Set;


//anyMatch() allMatch() noneMatch()
public class Demo6 {

	public static void main(String[] args) {
		
		Set<String> fruits= new HashSet<>();
		
		fruits.add("one apple");
		fruits.add("one mango");
		fruits.add("one apple");
		fruits.add("Two apple");
		fruits.add("More grapes");
		fruits.add("one orange");
		
		//anyMatch-> at least one value starts with one
		//allMatch-> every value starts with one
		//noneMatch-> none of the value starts with one
		
		
		boolean res1= fruits.stream().anyMatch(value -> {return value.startsWith("one");});
		boolean res2= fruits.stream().allMatch(value -> {return value.startsWith("one");});
		boolean res3= fruits.stream().noneMatch(value -> {return value.startsWith("one");});

		
		System.out.println(res1);
		
		System.out.println(res2);
		
		System.out.println(res3);
		
		
		

	}
}
