package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student janKowalski = new Student("Jan Kowalski");
        Student annaNowak = new Student("Anna Nowak");
        Student jessiePinkman = new Student("Jessie Pinkman");

        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");

        janKowalski.registerObserver(johnSmith);
        annaNowak.registerObserver(ivoneEscobar);
        jessiePinkman.registerObserver(johnSmith);

        //When
        janKowalski.sendTask("Task1");
        annaNowak.sendTask("Task2");
        annaNowak.sendTask("Task3");
        jessiePinkman.sendTask("Task4");
        jessiePinkman.sendTask("Task5");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());

    }

}
