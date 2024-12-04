package com.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Mapping & Collecting - uppercase
public class Test39 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("explained", "through", "arm","apple","bee","bye","Paper","head");
        List<String> collect = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
