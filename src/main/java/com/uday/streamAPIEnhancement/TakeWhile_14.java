package com.uday.streamAPIEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile_14 {
    public static void main(String args[]){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(4);integerList.add(6);integerList.add(3);
        integerList.add(1);integerList.add(8);integerList.add(-2);

        List<Integer> evenFilter=integerList.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println("Stream filtered list "+evenFilter);

        List<Integer> takeWhileList=integerList.stream().takeWhile(I->I%2==0).collect(Collectors.toList());
        System.out.println("Take while list "+takeWhileList);
    }
}
