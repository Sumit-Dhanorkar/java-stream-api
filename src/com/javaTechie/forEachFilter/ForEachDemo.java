package com.javaTechie.forEachFilter;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list=List.of("sumit", "ram","amit","sakshi");

        list.stream().forEach(i-> System.out.println(i));

        Map<Integer,String> map=Map.of(1,"sumit",2,"amit",3,"shubu",4,"ram");

        map.forEach((key,value)-> System.out.println(key+"->"+value));
        map.entrySet().stream().forEach((obj)-> System.out.println(obj));

        //internal working of consumer
        Consumer<String> consumer=(t)-> System.out.println(t);
        for (String s1:list){
            consumer.accept(s1);
        }
        System.out.println("==================");

        //filter

        for (String s:list){
            if(s.startsWith("s")){
                System.out.println(s);
            }
        }
        System.out.println("==================");

        list.stream().filter(i->i.startsWith("s")).forEach(i-> System.out.println(i));

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(System.out::println);



    }
}
