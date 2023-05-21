package com.javaTechie.ParallelStream;

import com.javaTechie.reduce.Employee;
import com.javaTechie.reduce.EmployeeDatabase;

import java.util.List;
import java.util.stream.IntStream;

public class ParrallelStreamExample {
    public static void main(String[] args) {
        long start=0;
        long end=0;

//        start=System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Time taken by stream -> "+(end-start));
//
//        //-----------------------------------------------
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Time taken by stream -> "+(end-start));

//
//        IntStream.range(1,10).forEach(x->{
//            System.out.println("thered -> "+Thread.currentThread().getName()+" -> "+x);
//        });
//
//
//        IntStream.range(1,10).parallel().forEach(x->{
//            System.out.println("thered -> "+Thread.currentThread().getName()+" -> "+x);
//        });


        List<Employee> employees= EmployeeDatabase.getEmployeessByParrallel();

        //normal

        start=System.currentTimeMillis();
        double salStream = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        end=System.currentTimeMillis();
        System.out.println("Time taken by normal stream -> "+(end-start)+" salary -> "+salStream);

        start=System.currentTimeMillis();
        double salPStream = employees.stream().parallel()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        end=System.currentTimeMillis();
        System.out.println("Time taken by parallel stream -> "+(end-start)+" salary -> "+salPStream);

    }
}
