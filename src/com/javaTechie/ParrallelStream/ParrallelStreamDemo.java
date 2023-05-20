package com.sumit.ParrallelStream;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
}

public class ParrallelStreamDemo {

	public static void main(String[] args) {
		
		List<Student> students=Arrays.asList(
				new Student("sumit", 80),
				new Student("amit", 50),
				new Student("nuira", 60),
				new Student("asdfgu", 90),
				new Student("dfgh", 87),
				new Student("sumdgit", 85),
				new Student("sfdit", 30)
		);
		
		//using stream -> sequential
	    students.stream().filter(s->s.getScore()>=80)
					                 .limit(3)
					                 .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
		
	    //using parrallel stream
	    students.parallelStream().filter(s->s.getScore()>=80)
        .limit(3)
        .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
	    
	    
	    //convert sequential stream()->parallelStream()
	    students.stream().parallel().filter(s->s.getScore()>=80)
        .limit(3)
        .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
	    
	    

	    
	    
		
	}
}
