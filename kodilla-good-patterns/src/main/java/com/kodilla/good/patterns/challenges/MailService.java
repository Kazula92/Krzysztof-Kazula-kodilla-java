package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("User: " + user.getUserName() + " First Name: " + user.getFirstName() + " Last Name: "
                            + user.getLastName() + " Mail: " + user.getMail());

    }
}
