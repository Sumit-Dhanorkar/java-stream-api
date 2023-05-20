package com.sumit.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {


	
	public static void main(String[] args) {
		
		//1 blank stream
		Stream<Object> emptyStream=Stream.empty();
		
		
		//2 array, object, collections
		String names[]= {"sumit","amit","ankit","divya"};
		
		Stream<String> stream1= Stream.of(names);
		
		stream1.forEach((e)->{
			System.out.println(e);
		});
		
		//3
		Stream<Object> streamBuilder=Stream.builder().build();
		
		//4 arrays stream
		
		IntStream stream= Arrays.stream(new int[] {12,5,6,74,23,5,634,64});
		
		stream.forEach((e)->{
			System.out.println(e);
		});
		
		
		//5. collection object list, set,
		
		List<Integer> list=new ArrayList<>();
		
		list.add(23);
	    list.add(233);
	    list.add(22);
	    list.add(44);
	    list.add(42);
	    
	    Stream<Integer> stream2=list.stream();
	    System.out.println("-----------------------------");
		
	    stream2.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}
