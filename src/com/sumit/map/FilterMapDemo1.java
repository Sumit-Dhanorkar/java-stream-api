package com.sumit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String empname;
	int salary;
	
	public Employee(int empid, String empname, int salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	
}

//combination of filter and map

public class FilterMapDemo1 {
	
	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(
				new Employee(1, "sumit", 20000),
				new Employee(2, "tejas", 40000),
				new Employee(3, "abhinav", 60000),
				new Employee(4, "ankit", 10000),
				new Employee(5, "amit", 20000)
		);
		
		
		List<Integer> empSal=new ArrayList<>();
		
		
		empSal= empList.stream()
			   .filter(e->e.salary>20000)
			   .map(e->e.salary)
			   .collect(Collectors.toList());
		
		System.out.println(empSal);
		
		
		
 	}

}
