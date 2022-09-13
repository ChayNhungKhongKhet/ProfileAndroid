package com.phamtantb24.profileui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageUser {
    private List<User> users;

    public ManageUser() {
        try {
            this.users = new ArrayList<>();
            File file = new File("data.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                String data = reader.nextLine();
                String[] userData = data.split(",");
                String userName = userData[0];
                String location = userData[1];
                int followers = Integer.parseInt(userData[2]);
                int followings = Integer.parseInt(userData[3]);
                String pass = userData[4];
                User user = new User(userName,location,followers,followings,pass);
                users.add(user);
            }
            reader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public User findAndCheckUser(String userName, String pass) {
        for (User u : users
             ) {
            if (u.getUserName().equalsIgnoreCase(userName) && pass.equals(u.getPass()))
                return u;
        }
        return null;
    }

    public boolean createNewUser(User user) {
        String fileName = "/app/src/main/java/com/phamtantb24/data/data.txt";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.append(user.getUserName());
            writer.append(","+user.getLocation());
            writer.append(","+user.getFollowers());
            writer.append(","+user.getFollowing());
            writer.append(","+user.getPass()+"\n");
            users.add(user);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
