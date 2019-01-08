package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfNullable_20 {
    public static void main(String args[]){
        List<String> stringList=new ArrayList<>();
        stringList.add("A");stringList.add("B");stringList.add(null);
        stringList.add("C");stringList.add(null);stringList.add("D");

        List<String> list=stringList.stream()
                .flatMap(I-> Stream.ofNullable(I)).collect(Collectors.toList());

        System.out.println("Initial list "+stringList);
        System.out.println("Processed list "+list);
    }
}
