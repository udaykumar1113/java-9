package com.uday.processAPI;

public class CurrentProcessInfo {
    public static void main(String args[]){
        ProcessHandle processHandle=ProcessHandle.current();
        ProcessHandle.Info info=processHandle.info();
        System.out.println("Complete process info"+info);
        System.out.println("User: "+info.user().get());
        System.out.println("Command: "+info.command().get());
        System.out.println("CPU duration:"+info.totalCpuDuration().get());
        System.out.println("Start time: "+info.startInstant().get());
    }
}
