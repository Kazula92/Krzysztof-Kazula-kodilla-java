package com.kodilla.testing.user;

public class SimpleUser {

    String username;
    static String realName;

    public SimpleUser(String username){
        this.username = username;
    }
    public SimpleUser(String username, String realName){
        this.username = username;
        this.realName = realName;
    }
    public String getUsername() {
        return username;
    }
    public static String getRealName(){
        return realName;
    }
}
