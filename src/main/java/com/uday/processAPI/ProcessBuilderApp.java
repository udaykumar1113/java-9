package com.uday.processAPI;

import java.io.IOException;

public class ProcessBuilderApp {
    public static void main(String args[]) throws IOException {
        ProcessBuilder processBuilder=new
                ProcessBuilder("C:\\Program Files\\Notepad++\\Notepad++.exe");
        processBuilder.start();
    }
}
