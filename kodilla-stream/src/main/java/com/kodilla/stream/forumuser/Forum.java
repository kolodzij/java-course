package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(1,"aaa",'M', LocalDate.of(1976, Month.MARCH,20), 12));
        theForumUser.add(new ForumUser(2,"bbb",'F',LocalDate.of(1992, Month.APRIL,4),3));
        theForumUser.add(new ForumUser(3,"ccc",'M',LocalDate.of(1984, Month.DECEMBER,12), 32));
        theForumUser.add(new ForumUser(4,"ddd",'F',LocalDate.of(2000, Month.JULY,26),11));
        theForumUser.add(new ForumUser(5,"eee",'M',LocalDate.of(1999, Month.JANUARY,17), 7));
        theForumUser.add(new ForumUser(6,"fff",'F',LocalDate.of(1956, Month.AUGUST,29),24));
        theForumUser.add(new ForumUser(7,"ggg",'M',LocalDate.of(2005, Month.MAY,9), 35));
        theForumUser.add(new ForumUser(8,"hhh",'M',LocalDate.of(1965, Month.FEBRUARY,14), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }
}
