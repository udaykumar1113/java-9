package com.uday.safevarargs;

import java.util.ArrayList;
import java.util.List;

public class HeapPollution_6 {
    public static void main(String args[]){
        List<String> list_1=new ArrayList<>();
        list_1.add("A");list_1.add("B");list_1.add("C");
        List<String> list_2=new ArrayList<>();
        list_2.add("D");list_2.add("E");list_2.add("F");
        method(list_1,list_2);
    }

    @SafeVarargs
    public static void method(List<String>...lists){
        for(List<String> list:lists){
            System.out.println(list);
        }
    }
}
