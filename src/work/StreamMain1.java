package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        //create a list and filter all even numbers from list

        List<Integer> list1 = List.of(10, 23, 34, 45, 45, 56);

//        System.out.println(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(234);
        list2.add(23);

        List<Integer> list3= Arrays.asList(12,34,32,43);

        List<Integer> listEven=new ArrayList<>();

        for (Integer i:list1){
            if (i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        Stream<Integer> stream = list1.stream();
//        List<Integer> newList= stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1=list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newList1);


    }
}
