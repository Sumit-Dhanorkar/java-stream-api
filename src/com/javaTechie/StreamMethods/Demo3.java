package com.sumit.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
	//reduce
	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("A","B","C","1","2","3");
		
		Optional<String> str= strList.stream().reduce((value,combineValue)->{
			return combineValue+value;
		});
		
		System.out.println(str.get());
		
	}

}
