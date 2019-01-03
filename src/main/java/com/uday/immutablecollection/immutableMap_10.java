package com.uday.immutablecollection;

import java.util.Map;

public class immutableMap_10 {
    public static void main(String args[]){
        Map<String,Integer> unmodifiableMap=
                Map.of("A",1,"B",2,"C",3,"D",4);
        System.out.println(unmodifiableMap);
        System.out.println(unmodifiableMap.getClass().getName());
    }
}
