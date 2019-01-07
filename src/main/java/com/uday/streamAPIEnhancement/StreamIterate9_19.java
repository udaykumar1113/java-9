package com.uday.streamAPIEnhancement;

import java.util.stream.Stream;

public class StreamIterate9_19 {
    public static void main(String args[]){
        Stream.iterate(5, I->I<=100, I->I+10).forEach(System.out::println);
    }
}
