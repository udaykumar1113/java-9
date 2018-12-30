package com.uday.privatemethods;

interface Interf{
    default void method_1(){
        commonMethod();
        System.out.println("Method 1 code");
    }

    default void method_2(){
        commonMethod();
        System.out.println("Method 2 code");
    }
    private void commonMethod(){
        System.out.println("Common code");
    }
}
public class PrivateMethodImpl_1 implements Interf{
    public static void main(String args[]){
        PrivateMethodImpl_1 privateMethodImpl_1=new PrivateMethodImpl_1();
        privateMethodImpl_1.method_1();
        privateMethodImpl_1.method_2();
    }
}
