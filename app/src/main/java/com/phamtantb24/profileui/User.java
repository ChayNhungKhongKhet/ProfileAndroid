package com.phamtantb24.profileui;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String location;
    private int followers,following;
    private String pass;

    public User() {
    }

    public User(String userName, String location, int followers, int following, String pass) {
        this.userName = userName;
        this.location = location;
        this.followers = followers;
        this.following = following;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", location='" + location + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                ", pass='" + pass + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
