package com.uday.processAPI;

import java.util.Optional;

public class ProcessInfoByPid {
    public static void main(String args[]){
        Optional<ProcessHandle> optionalProcessHandle=ProcessHandle.of(8604);
        ProcessHandle processHandle=optionalProcessHandle.get();
        ProcessHandle.Info info=processHandle.info();
        System.out.println(" "+info.startInstant());
        System.out.println(" "+info.totalCpuDuration());
        System.out.println(" "+info.command());
        System.out.println(" "+info.user());
        System.out.println(" "+info.arguments());
    }
}
