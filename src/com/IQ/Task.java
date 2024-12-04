package com.IQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task {

    public static void main(String[] a){
        List<Student> studentList = new ArrayList<>();
        Random random = new Random();
        List<Integer> grades =new ArrayList<>();

        for(int i=0; i<5; i++){
            var studentName = "Student"+i;
            var age = 18 + random.nextInt(5);
            for(int j=0; j<1; j++) {
                grades.add(50 + random.nextInt(5));

            }

            studentList.add(new Student(studentName,age, grades));
        }

        System.out.println(studentList);
    }
}
