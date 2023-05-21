package com.javaTechie.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee> getEmployeess(){
        return Stream.of(
                new Employee(101,"sumit","A",60000),
                new Employee(102,"amit","B",30000),
                new Employee(103,"sam","A",80000),
                new Employee(104,"santosh","A",90000),
                new Employee(105,"arru","C",15000)
        ).collect(Collectors.toList());
    }

    public static List<Employee> getEmployeessByParrallel(){
      List<Employee> employees=new ArrayList<>();
      for (int i=0;i<=1000;i++){
          employees.add(new Employee(i,"emp"+1,"a",i*10000));

      }

      return employees;
    }
}
