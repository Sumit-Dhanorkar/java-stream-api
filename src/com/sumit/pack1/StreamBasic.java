package com.sumit.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamBasic {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(23);
	    list.add(233);
	    list.add(22);
	    list.add(44);
	    list.add(42);
	    
	    System.out.println(list);
	    
	    List<Integer> list1=List.of(12,34,64,55,43,32,33,37);
	    
	    System.out.println(list1);
	    
	    List<Integer> evenList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	    
	    System.out.println(evenList);
	    
	}
}
