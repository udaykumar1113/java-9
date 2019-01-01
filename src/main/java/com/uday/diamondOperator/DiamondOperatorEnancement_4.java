package com.uday.diamondOperator;

class MyGenericClass<T>{
    T obj;
    public MyGenericClass(T obj) {
        this.obj=obj;
    }

    public T getGenericObject(){
        return obj;
    }

    public void process(){
        System.out.println("Processing the generic object "+obj);
    }
}

public class DiamondOperatorEnancement_4 {
    public static void main(String args[]){
        MyGenericClass<String> genObject=new MyGenericClass<>("String"){
            @Override
            public String getGenericObject() {
                return super.getGenericObject();
            }
        };
        genObject.process();
        System.out.println(genObject.getGenericObject());
    }
}
