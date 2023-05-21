package com.javaTechie.sortList;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,43,46,7,8,4,1);

//        Collections.sort(list); //
//        System.out.println("asc-------------");
//        System.out.println(list);
//        System.out.println("desc------------");
//        Collections.reverse(list); //desc
//        System.out.println(list);
//
//        System.out.println("asc-------------");
//        list.stream().sorted().forEach(s-> System.out.println(s));
//        System.out.println("desc------------");
//        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

        List<Employee> employees=Database.getEmployee();

//
//        Collections.sort(employees,new MyComparator());
//
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
////            return (int) (o1.getSal()-o2.getSal()); //asc
//                return (int) (o2.getSal()-o1.getSal()); //desc
//            }
//        });

        //using lambda
        Collections.sort(employees,((o1, o2) -> (int)(o1.getSal()-o2.getSal())));

        //asc
        employees.stream().sorted((o1, o2) -> (int)(o1.getSal()-o2.getSal()))
                        .forEach(s-> System.out.println(s));

        //desc
        employees.stream().sorted((o1, o2) -> (int)(o2.getSal()-o1.getSal()))
                            .forEach(s-> System.out.println(s));


        employees.stream().sorted(Comparator.comparing(emp-> emp.getSal())).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
//        employees.stream().forEach(s-> System.out.println(s));
//        System.out.println(employees);
    }

    static class MyComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
//            return (int) (o1.getSal()-o2.getSal()); //asc
            return (int) (o2.getSal()-o1.getSal()); //desc
        }
    }
}
