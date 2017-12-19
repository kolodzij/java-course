package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void addLog() {
        Logger.getInstance().log("Item bee cannot be created");
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Log: " + log);
        //Then
        Assert.assertEquals("Item bee cannot be created", log);
    }
}
