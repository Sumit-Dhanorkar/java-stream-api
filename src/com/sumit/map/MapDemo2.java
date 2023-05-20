package com.sumit.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");

		//without using stream
		
//		for(String name:vehicles) {
//			System.out.println(name.length());
//		}
//		
		
		vehicles.stream().map(s->s.length()).forEach(System.out::println);
		
		
	}
}
