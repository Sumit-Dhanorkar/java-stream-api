package com.sumit.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		
		List<String> names=List.of("sdf","safdf","sdfaf","sdfsdf","asdfjioasdf");
		List<String> longNames=new ArrayList<>();
		
		longNames=names.stream().filter(str->str.length()>=6 && str.length()<=12).collect(Collectors.toList());
		System.out.println(longNames);
		names.stream().filter(n->n.length()>=6 && n.length()<10).forEach(System.out::println);
	}
}
