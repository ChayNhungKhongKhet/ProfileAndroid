package com.phamtantb24.profileui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        List<User> users = new ArrayList<>();
        try{
            File file = new File("..//data//data.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String data = reader.nextLine();
                String[] userData = data.split(",");
                System.out.println(userData.length);
                String userName = userData[0];
                String location = userData[1];
                int folowers = Integer.parseInt(userData[2]);
                int followings = Integer.parseInt(userData[3]);
                String pass = userData[4];
//                User user = new User(userName,location,folowers,followings,pass);
//                users.add(user);
//                for (User u : users
//                ) {
//                    System.out.println(u);
//                }
                System.out.printf("%s,%s,%d,%d,%s", userName,location,folowers,followings,pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
