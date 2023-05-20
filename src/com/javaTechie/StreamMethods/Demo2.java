package com.sumit.StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numbeList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//count
		long count=numbeList.stream().filter(num->num%2==0).count();
		System.out.println(count);

		//min
	    Optional<Integer> min= numbeList.stream().min((val1,val2)->{return val1.compareTo(val2);});
		
	    System.out.println(min.get());
	    
	    //max
	    Optional<Integer> max= numbeList.stream().max((val1,val2)->{return val1.compareTo(val2);});
	    
	    System.out.println(max.get());

	}
}
