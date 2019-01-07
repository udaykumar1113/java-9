package com.uday.streamAPIEnhancement;

import java.util.stream.Stream;

public class StreamIterate_18 {
    public static void main(String args[]){
        Stream.iterate(1, i->i+5).limit(5).forEach(System.out::println);
    }
}
