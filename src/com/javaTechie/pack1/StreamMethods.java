package com.sumit.pack1;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		//filter(predicates) where predicates =boolean value function
		//e->{ return true or false } or e->true or e-> condition
		
		//map(Function) -> each element operation 
		// Function returns value
		
		
		List<String> names=List.of("aman","ankit","durgesh","abhinav","durgesh");
		
		List<String> newNames= names.stream().filter((e)-> e.startsWith("a")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
		List<Integer> numbers=List.of(12,34,56,55,32,22,11);
		
		List<Integer> newNum= numbers.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(newNum);
		
		System.out.println("-----------------------------");
		
		names.stream().forEach((e)-> System.out.println(e));
		
		System.out.println("-----------------------------");

		names.stream().forEach(System.out :: println);

		System.out.println("-----------------------------");

		numbers.stream().sorted().forEach(System.out::println);
		

		Integer integer= numbers.stream().min((x,y)->x.compareTo(y)).get();
		
		System.out.println("-----------------------------");

		System.out.println(integer);
		
		Integer integer1= numbers.stream().max((x,y)->x.compareTo(y)).get();
		
		System.out.println("-----------------------------");

		System.out.println(integer1);
	
	}
}
