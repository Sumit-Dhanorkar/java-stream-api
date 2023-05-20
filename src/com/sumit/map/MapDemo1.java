package com.sumit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");

		
		List<String> vehiListUpp=new ArrayList<>();
		
		
//		for(String v:vehicles) {
//			vehiListUpp.add(v.toUpperCase());
//		}
//		System.out.println(vehiListUpp);
		
		
		
		vehiListUpp=vehicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiListUpp);
		
		vehicles.stream().map(v->v.toUpperCase()).forEach(System.out::println);
		
		

	}
}
