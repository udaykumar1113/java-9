package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhile_16 {
    public static void main(String args[]){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(4);integerList.add(6);integerList.add(3);
        integerList.add(1);integerList.add(8);integerList.add(-2);

        List<Integer> dropWhileList=integerList.stream()
                .dropWhile(I->I%2==0).collect(Collectors.toList());

        System.out.println("Original list "+integerList);
        System.out.println("Drop while list "+dropWhileList);
    }
}
