package com.javaTechie.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap {
    public static void main(String[] args) {
        List<Customer> customers=EkartDatabase.getAll();

        //List<Customer> -> List<String>
        //mapping customer->customer.getEmail()  -> one to one mapping

        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //customer -> customer.getPhoneNumbers() -> one to many mapping
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        System.out.println("===================================");

        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);


    }
}
