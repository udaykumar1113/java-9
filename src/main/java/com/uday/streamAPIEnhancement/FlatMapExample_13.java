package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample_13 {
    public static void main(String args[]){
        List<Integer> originalList=new ArrayList<>();
        originalList.add(1);originalList.add(2);originalList.add(3);
        originalList.add(4);originalList.add(5);originalList.add(6);
        //filtered even numbers
        List<Integer> evenList=originalList.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(evenList);
        //adding even numbers and multiplying by 10
        List<Integer> processedList=evenList.stream()
                .flatMap(I->{if(I%2!=0)
                        return Stream.empty();
                    else
                        return Stream.of(I, I*10);
        }).collect(Collectors.toList());
        System.out.println(processedList);
    }
}
