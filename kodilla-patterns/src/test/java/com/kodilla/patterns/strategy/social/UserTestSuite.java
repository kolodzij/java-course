package com.kodilla.patterns.strategy.social;

import org.junit.Test;
import org.junit.Assert;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Anna Nowak");
        User user2 = new YGeneration("Jan Kowalski");
        User user3 = new ZGeneration("Pan X");

        //When
        String user1Publisher = user1.sharePost();
        System.out.println("User1 should use: " + user1Publisher);
        String user2Publisher = user2.sharePost();
        System.out.println("User2 should use: " + user2Publisher);
        String user3Publisher = user3.sharePost();
        System.out.println("User3 should use: " + user3Publisher);

        //Then
        Assert.assertEquals("Facebook", user1Publisher);
        Assert.assertEquals("Twitter", user2Publisher);
        Assert.assertEquals("Snapchat", user3Publisher);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User sampleUser = new Millenials("Steven Links");

        //When
        String sampleUserPublisher = sampleUser.sharePost();
        System.out.println("SampleUser should use: " + sampleUserPublisher);
        sampleUser.setSocialPublisher(new TwitterPublisher());
        sampleUserPublisher = sampleUser.sharePost();
        System.out.println("SampleUser now should use: " + sampleUserPublisher);

        //Then
        Assert.assertEquals("Twitter", sampleUserPublisher);

    }
}
