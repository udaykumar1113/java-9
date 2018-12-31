package com.uday.trywithresource;

class MyResource implements AutoCloseable{

    public void doPerform(){
        System.out.println("In perform method");
    }
    @Override
    public void close() throws Exception {
        System.out.println("This is close method");
    }
}

public class Jdk9TryWithResource_3 {

    public static void main(String args[]){
        MyResource resource_1=new MyResource();
        MyResource resource_2=new MyResource();
        MyResource resource_3=new MyResource();

        try(resource_1;resource_2;resource_3){
            resource_1.doPerform();
            resource_2.doPerform();
            resource_3.doPerform();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
