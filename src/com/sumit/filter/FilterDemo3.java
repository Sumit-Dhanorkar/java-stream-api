package com.sumit.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("nuir","sdf",null,"asdf",null,"asdfsdf",null);
		
		List<String> res= words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(res);
		
	}
}
