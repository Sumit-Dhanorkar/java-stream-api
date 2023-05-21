package com.javaTechie.sortList;

import java.util.*;
import java.util.Map.Entry;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=Map.of(1,"sumit",2,"amit",3,"shubu",4,"ram");

        Map<Employee,Integer> employeeMap=new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSal()-o2.getSal());
            }
        });
        employeeMap.put(new Employee(1,"sumit","it",2000000),60);
        employeeMap.put(new Employee(2,"amit","cs",6000000),90);
        employeeMap.put(new Employee(3,"ankush","int",80000000),50);
        employeeMap.put(new Employee(4,"sunita","extc",400000),40);
        employeeMap.put(new Employee(5,"sanju","civil",90000000),120);

        Map<Employee, Integer> employeess = new TreeMap<>((o1,o2)->(int)(o2.getSal()-o1.getSal()));
        employeess.put(new Employee(1, "sumit", "it", 2000000), 60);
        employeess.put(new Employee(2, "amit", "cs", 6000000), 90);
        employeess.put(new Employee(3, "ankush", "int", 80000000), 50);
        employeess.put(new Employee(4, "sunita", "extc", 400000), 40);
        employeess.put(new Employee(5, "sanju", "civil", 90000000), 120);


        System.out.println(employeess);

        List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });

//        map.entrySet().stream().forEach(e-> System.out.println(e));

//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);




//        Collections.sort(list);

    }
}
