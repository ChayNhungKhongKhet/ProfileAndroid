package com.phamtantb24.data;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        try {
            File file = new File("./data.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                String data = reader.nextLine();
                String[] name = data.split(",");
                for (String s : name
                     ) {
                    System.out.print(s);
                }
                System.out.println();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
