package com.sumit.StreamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
	
	public static void main(String[] args) {
		List<String> strList=Arrays.asList("A","B","C","1","2","3");

		Object arr[]= strList.stream().toArray();
		
		System.out.println(Arrays.toString(arr));
	}

}
