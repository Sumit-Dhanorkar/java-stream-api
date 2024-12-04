package com.IQ;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//3) How do you find frequency of each character in a string using Java 8 streams?
public class Test3 {

    public static void main(String[] args){
        String inputString = "Java Concept Of The Day java DAy Java";

        Map<Character,Long>h = inputString.replace(" ","").toLowerCase().chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("h"+h);

        Map<String, Long> collect = Stream.of(inputString.toLowerCase().split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Collect"+collect);

        //Without space
        Map<Character,Long>a11 = inputString.toLowerCase().replace(" ","").chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("a11 "+a11);

        Map<String,Long> k11 =Stream.of(inputString.toLowerCase().split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("k11 "+k11);

        //With space
        Map<Character, Long> a1 = inputString.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(a1);

        Map<String,Long>a2 = Stream.of(inputString.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(a2);


        //chars() method returns an IntStream that contains the Unicode code points of the characters in the string
        IntStream chars = inputString.chars();
 //convert the IntStream to a Stream of characters ---> (IntStream) to (Stream<Character>)
        Stream<Character> charList = chars.mapToObj(c -> (char) c);
        charList.forEach(System.out :: println);

//Print each character using mapToObj and forEach
        String inputString1 = "Hello";
        inputString1.chars().mapToObj(x->(char)x).forEach(System.out :: println);
//Print each character using forEach
        String inputString2 = "Example";
        inputString2.chars().forEach(y -> System.out.println((char) y));

        //frequency of each character in a string
//Using Function and stream collector
        Map<Character, Long>frequency = inputString.chars().mapToObj(t -> (char)t).collect(Collectors.groupingBy(o -> (char)o,Collectors.counting()));
        System.out.println("frequency of each element is "+frequency);
//Using Function.identity and stream collector
        Map<Character, Long>frequency1 = inputString.chars().mapToObj(t -> (char)t).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("frequency of each element is "+frequency1);




    }

//mapToObj()
//The mapToObj() method in Java is used to transform a primitive stream (such as IntStream, LongStream,
// or DoubleStream) into an object-valued stream of type Stream<T>, where T is the type of the objects in
// the resulting stream.

//boxed()
//boxed() is used to convert a Stream<Character> (which is a stream of primitive char values) to a
// Stream<Character> (which is a stream of object Character values).
//because the Collectors.groupingBy collector expects a Stream of object types, not primitive types.
// By using boxed(), we ensure that the Stream is converted to a type that is compatible with the collector.
}
