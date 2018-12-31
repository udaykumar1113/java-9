package com.uday.trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource_2 {
    public static void main(String args[]){
        try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))){
            System.out.println("It is valid to declare resources in try");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
