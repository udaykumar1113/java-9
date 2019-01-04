package com.uday.immutablecollection;

import java.util.Map;

public class ImmutableMapWithEntries_11 {
    public static void main(String args[]){
        Map.Entry<Integer,String> e1=Map.entry(1,"A");
        Map.Entry<Integer,String> e2=Map.entry(2,"B");
        Map.Entry<Integer,String> e3=Map.entry(3,"C");
        Map.Entry<Integer,String> e4=Map.entry(4,"D");

        Map<Integer,String> immutableMap=Map.ofEntries(e1,e2,e3,e4);
        System.out.println(immutableMap);
    }
}
