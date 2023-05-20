package com.sumit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo7 {
	
	public static void main(String[] args) {
		
		//findAny()
		List<String> stringList=Arrays.asList("two","two","three","one");
		
		Optional<String> ele = stringList.stream().findAny();
		
		System.out.println(ele.get());
		
		//findFist()
		
		Optional<String> ele1=stringList.stream().findFirst();
		
		System.out.println(ele1.get());
	}

}
