package com.kodilla.good.patterns.challenges;

public class User {

    public String userName;
    public String firstName;
    public String lastName;
    public String mail;

    public User(String userName, String firstName, String lastName, String mail) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }
}
