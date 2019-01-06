package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileString_15 {

    public static void main(String args[]){
        List<String> stringList=new ArrayList<>();
        stringList.add("A");stringList.add("AA");stringList.add("AAA");
        stringList.add("AAAA");stringList.add("AAAAA");stringList.add("AAAAAA");

        List<String> filteredLists=stringList.stream().filter(I->I.length()%2==0)
                .collect(Collectors.toList());
        System.out.println("Filtered even length strings "+filteredLists);

        List<String> takeWhileList=stringList.stream().takeWhile(I->I.length()%2!=0)
                .collect(Collectors.toList());
        System.out.println("Take while list "+takeWhileList);
    }
}
