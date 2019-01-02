package com.uday.immutablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList_7 {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        list.add("A");list.add("B");list.add("C");list.add("D");
        List<String> immutableList= Collections.unmodifiableList(list);
        System.out.println(immutableList);

        immutableList.add("E");
    }
}
