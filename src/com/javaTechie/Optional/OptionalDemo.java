package com.javaTechie.Optional;

import com.javaTechie.map.Customer;
import com.javaTechie.map.EkartDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {


    public static Customer getCustomerByEmailId(String email){
        List<Customer> customers = EkartDatabase.getAll();
        return customers.stream().filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(()->new RuntimeException("no customer presnet with this id"));
    }

    public static void main(String[] args) {
        Customer customer=new Customer(101,"john","test@gmai", Arrays.asList("2345235","dsfgsdfg"));

        //empty
        //of
        //ofNullable


        Optional<Object> emptyOptional=Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emailOptional1 = Optional.of(customer.getEmail());

//        System.out.println(emailOptional1);

        Optional<String> emailOptional2=Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional2.orElse("default@gmail.com"));
//        System.out.println(emailOptional2.orElseThrow(()->new RuntimeException("email not present")));

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email"));

        getCustomerByEmailId("pesf");

    }
}
