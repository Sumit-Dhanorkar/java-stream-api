package com.sumit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//distinct() count() limit()
public class Demo1 {

	public static void main(String[] args) {
		List<String> vehicles= Arrays.asList("bus","car","car","bus","bike","bike");
		
		//distinct
		List<String> list= vehicles.stream().distinct().collect(Collectors.toList());
		
		vehicles.stream().distinct().forEach(System.out::println);
		System.out.println(list);
		
		//count
		long count=vehicles.stream().distinct().count();
		
		System.out.println(count);
		
		//limit
		List<String> list2= vehicles.stream().limit(4).collect(Collectors.toList());

		System.out.println(list2);
		
		
	}
}
