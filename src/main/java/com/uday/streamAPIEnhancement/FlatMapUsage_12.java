package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapUsage_12 {
    public static void main(String args[]){
        List<Integer> numberList=new ArrayList<>();
        numberList.add(5);numberList.add(4);numberList.add(3);numberList.add(2);
        List<Integer> processedList=numberList.stream()
                .flatMap(I-> Stream.of(I*I,I*I*I)).collect(Collectors.toList());

        System.out.println(processedList);
    }
}
