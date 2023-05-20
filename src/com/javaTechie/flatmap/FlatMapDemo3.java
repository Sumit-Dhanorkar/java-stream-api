package com.sumit.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int sid;
	char grade;
	public Student(String name, int sid, char grade) {
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}
}

public class FlatMapDemo3 {
	
	public static void main(String[] args) {
		
		List<Student> class1=Arrays.asList(
				new Student("sumit", 1, 'A'),
				new Student("amit", 2, 'B'),
				new Student("shubham", 3, 'C'),
				new Student("niraj", 4, 'D'),
				new Student("shreyash", 5, 'A')
		);
		
		List<Student> class2=Arrays.asList(
				new Student("scoot", 6, 'A'),
				new Student("samiksha", 7, 'D'),
				new Student("brad", 8, 'A'),
				new Student("pit", 9, 'C'),
				new Student("kitty",10, 'A')
		);
		
		List<List<Student>> finalList=Arrays.asList(class1,class2);
		
		
		for(List<Student> s:finalList) {
			for(Student stu:s) {
				System.out.println(stu.name);
			}
		}
		
		

		List<String> names=finalList.stream().flatMap(s->s.stream().map(n-> n.name)).collect(Collectors.toList());
		
		System.out.println(names);
		
		
	}

}
