package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1993,5,22), 5));
        theUserList.add(new ForumUser(2, "Kasia", 'F', LocalDate.of(2008,11,12), 22));
        theUserList.add(new ForumUser(3, "Klaudia", 'M', LocalDate.of(2002,7,30), 43));
        theUserList.add(new ForumUser(4, "Andrzej", 'F', LocalDate.of(1999,2,14), 0));
    }
    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }
}
