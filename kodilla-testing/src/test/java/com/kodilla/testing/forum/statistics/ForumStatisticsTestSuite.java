package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testNoOfPosts0() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();
        resultUsersNameList.add("A");
        resultUsersNameList.add("B");

        int resultNumberOfPosts = 0;
        int resultCommentsCount=0;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(0.0,thePostsAvg, 0.0);
        Assert.assertEquals(0.0,theCommentsAvg, 0.0);
        Assert.assertEquals(0.0,theCommentsPerPostsAvg, 0.0);
    }

    @Test
    public void testNoOfPosts1000() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();
        resultUsersNameList.add("A");
        resultUsersNameList.add("B");

        int resultNumberOfPosts = 1000;
        int resultCommentsCount=200;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(500.0,thePostsAvg, 0.0);
        Assert.assertEquals(100.0,theCommentsAvg, 0.0);
        Assert.assertEquals(0.2,theCommentsPerPostsAvg, 0.0);
    }

    @Test
    public void testNoOfComments0() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();
        resultUsersNameList.add("A");
        resultUsersNameList.add("B");

        int resultNumberOfPosts = 24;
        int resultCommentsCount=0;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(12.0,thePostsAvg, 0.0);
        Assert.assertEquals(0,theCommentsAvg, 0.0);
        Assert.assertEquals(0,theCommentsPerPostsAvg, 0.0);
    }

    @Test
    public void testNoOfCommentsLess() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();
        resultUsersNameList.add("A");
        resultUsersNameList.add("B");

        int resultNumberOfPosts = 60;
        int resultCommentsCount=12;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(30.0,thePostsAvg, 0.0);
        Assert.assertEquals(6,theCommentsAvg, 0.0);
        Assert.assertEquals(0.2,theCommentsPerPostsAvg, 0.0);
    }

    @Test
    public void testNoOfCommentsMore() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();
        resultUsersNameList.add("A");
        resultUsersNameList.add("B");
        resultUsersNameList.add("C");

        int resultNumberOfPosts = 15;
        int resultCommentsCount=30;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(5,thePostsAvg, 0.0);
        Assert.assertEquals(10,theCommentsAvg, 0.0);
        Assert.assertEquals(2,theCommentsPerPostsAvg, 0.0);
    }

    @Test
    public void testNoOfUsers0() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();

        int resultNumberOfPosts = 0;
        int resultCommentsCount=0;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(0.0,thePostsAvg, 0.0);
        Assert.assertEquals(0.0,theCommentsAvg, 0.0);
        Assert.assertEquals(0.0,theCommentsPerPostsAvg, 0.0);

    }

    @Test
    public void testNoOfUsers100() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        StatsCalculator stats = new StatsCalculator();
        List<String> resultUsersNameList = new ArrayList<String>();
        resultUsersNameList=generateUsers(100);

        int resultNumberOfPosts =80;
        int resultCommentsCount=20;

        when(statsMock.usersNames()).thenReturn(resultUsersNameList);
        when(statsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        stats.calculateAdvStatistics(statsMock);
        double thePostsAvg = stats.getPostsAvg();
        double theCommentsAvg=stats.getCommentsAvg();
        double theCommentsPerPostsAvg=stats.getCommentsPerPostsAvg();

        //Then
        Assert.assertEquals(0.8,thePostsAvg, 0.0);
        Assert.assertEquals(0.2,theCommentsAvg, 0.0);
        Assert.assertEquals(0.25,theCommentsPerPostsAvg, 0.0);
    }

    public ArrayList<String> generateUsers(int arraySize) {
        ArrayList<String> usersList = new ArrayList<String>();
        for (int n =1; n<=arraySize; n++) {
            usersList.add("A"+n);
        }
        return usersList;

    }
}
