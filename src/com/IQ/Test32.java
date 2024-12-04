package com.IQ;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Collections;

//32) Find the age of a person in years if the birthday has given?
public class Test32 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1985, 01, 23);
        LocalDate today = LocalDate.now();


        int i = today.compareTo(birthDay);
        System.out.println(i);

        int years = Period.between(birthDay, today).getYears();
        System.out.println(years);


        long between = ChronoUnit.YEARS.between(birthDay, today);
        System.out.println(between);

    }
}
