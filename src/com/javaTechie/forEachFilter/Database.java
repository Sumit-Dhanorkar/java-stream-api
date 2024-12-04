package com.javaTechie.forEachFilter;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployee(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"sumit","it",20000000));
        list.add(new Employee(2,"amit","cs",6000000));
        list.add(new Employee(3,"ankush","int",80000000));
        list.add(new Employee(4,"sunita","extc",400000));
        list.add(new Employee(5,"sanju","civil",90000000));

        return list;
    }
}

