package com.javaTechie.forEachFilter;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input){

        if (input.equalsIgnoreCase("tax")){
            return   Database.getEmployee().stream()
                    .filter(employee -> employee.getSal()>500000)
                    .collect(Collectors.toList());
        }else{
            return   Database.getEmployee().stream()
                    .filter(employee -> employee.getSal()<500000)
                    .collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("non tax"));
    }
}
