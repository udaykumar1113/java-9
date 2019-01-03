package com.uday.immutablecollection;

import java.util.Set;

public class ImmutableSet_9 {
    public static void main(String args[]){
        Set<String> immutableSet=Set.of("A","B","C","D");
        System.out.println(immutableSet.getClass().getName());
        System.out.println(immutableSet);
    }
}
