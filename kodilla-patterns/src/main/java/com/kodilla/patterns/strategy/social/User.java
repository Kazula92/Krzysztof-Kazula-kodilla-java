package com.kodilla.patterns.strategy.social;

public class User {

    String nameUser;
    protected SocialPublisher socialPublisher;

    public User(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
