package com.kodilla.stream.forumuser;

import java.time.*;

import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userId,final String username, final char gender, final LocalDate birthDate, final int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public long getUserAge(){
        //long result= LocalDate.now().until(birthDate,YEARS);
        long result = birthDate.until(LocalDate.now(),YEARS);
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
