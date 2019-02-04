package com.uday.processAPI;

public class CurrentProcess {
    public static void main(String args[]) throws InterruptedException {
        ProcessHandle handle=ProcessHandle.current();
        long pid=handle.pid();
        System.out.println("The current running PID is: "+pid);
        Thread.sleep(1000000);
    }
}
