package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileString_17 {
    public static void main(String args[]){
        List<String> stringList=new ArrayList<>();
        stringList.add("A");stringList.add("AA");stringList.add("AAA");
        stringList.add("AAAA");stringList.add("AAAAA");stringList.add("AAAAAA");
        System.out.println("Original string list "+stringList);

        List<String> dropWhileList=stringList.stream()
                .dropWhile(I->I.length()<4).collect(Collectors.toList());
        System.out.println("Drop while list "+dropWhileList);

    }
}
