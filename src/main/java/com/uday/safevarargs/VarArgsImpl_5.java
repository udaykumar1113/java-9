package com.uday.safevarargs;

public class VarArgsImpl_5 {

    public static void main(String arg[]){
        sum(10);
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
    }

    static void sum(int...x){
        int sum=0;
        for(int x1:x){
            sum=sum+x1;
        }
        System.out.println("Sum is "+sum);
    }
}
