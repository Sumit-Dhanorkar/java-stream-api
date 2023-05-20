package com.sumit.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		List<String> teamA=Arrays.asList("sumit","amit","pumit","bumit");
		List<String> teamB=Arrays.asList("saurabh","aarambh","karmby","asdfg");
		List<String> teamC=Arrays.asList("asdfg","fghsd","pasdfg","basd");
		List<String> teamD=Arrays.asList("fasfgt","aasdfg","asdfgs","sfdgg");
		
		List<List<String>> playerInworldCup=new ArrayList<>();
		
		playerInworldCup.add(teamA);
		playerInworldCup.add(teamB);
		playerInworldCup.add(teamC);
		playerInworldCup.add(teamD);
		
		//without stream0
		for(List<String> team:playerInworldCup) {
			for(String name:team) {
				System.out.println(name);
			}
		}
		
		
		//using stream
		
		List<String> name= playerInworldCup.stream()
										   .flatMap(n->n.stream())
										   .collect(Collectors.toList());
		System.out.println(name);

	}
}
