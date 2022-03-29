package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private final String userName;

    public ForumUser() {
        userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}