package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User hulk = new Millenials("Hulk");
        User potter = new ZGeneration("Harry Potter");
        User batman = new YGeneration("BATMAN");

        //When
        String hulkSocialMedia = hulk.sharePost();
        System.out.println("Hulk user: " + hulkSocialMedia);
        String potterSocialMedia = potter.sharePost();
        System.out.println("Harry Potter user: " + potterSocialMedia);
        String batmanSocialMedia = batman.sharePost();
        System.out.println("BATMAN user: " + batmanSocialMedia);

        //Then
        assertEquals("Snapchat", hulkSocialMedia);
        assertEquals("Facebook", potterSocialMedia);
        assertEquals("Twitter", batmanSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User hulk = new Millenials("Hulk");

        //When
        String hulkSocialMedia = hulk.sharePost();
        System.out.println("Hulk user: " + hulkSocialMedia);
        hulk.setSocialPublisher(new FacebookPublisher());
        hulkSocialMedia = hulk.sharePost();
        System.out.println("Hulk now a user: " + hulkSocialMedia);

        //Then
        assertEquals("Facebook", hulkSocialMedia);
    }
}
