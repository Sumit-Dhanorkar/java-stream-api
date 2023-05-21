package com.javaTechie.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("234345345","2345324")),
                new Customer(102,"sumit","sumit@gmail.com", Arrays.asList("23463434","34535462345")),
                new Customer(103,"amit","amit@gmail.com", Arrays.asList("34754672334","23465466")),
                new Customer(104,"santosh","santisg@gmail.com", Arrays.asList("234646324","3455673245")),
                new Customer(105,"ram","ram@gmail.com", Arrays.asList("345645567","56788"))
        ).collect(Collectors.toList());
    }
}
