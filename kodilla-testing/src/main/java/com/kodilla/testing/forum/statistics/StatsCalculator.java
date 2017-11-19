package com.kodilla.testing.forum.statistics;

public class StatsCalculator {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsAvg;
    private double commentsAvg;
    private double commentsPerPostsAvg;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers=statistics.usersNames().size();
        numberOfPosts=statistics.postsCount();
        numberOfComments=statistics.commentsCount();
        if (numberOfPosts>0) {
            postsAvg=(double)numberOfPosts/numberOfUsers;}
        else {
            postsAvg=0;
        }
        if (numberOfUsers>0) {
            commentsAvg=(double)numberOfComments/numberOfUsers;}
        else {
            commentsAvg=0;
        }
        if (numberOfPosts>0) {
            commentsPerPostsAvg=(double)numberOfComments/numberOfPosts;}
        else {
            commentsPerPostsAvg=0;}
    }

    public double getPostsAvg() {
        return postsAvg;
    }

    public double getCommentsAvg() {
        return commentsAvg;
    }

    public double getCommentsPerPostsAvg() {
        return commentsPerPostsAvg;
    }
}
