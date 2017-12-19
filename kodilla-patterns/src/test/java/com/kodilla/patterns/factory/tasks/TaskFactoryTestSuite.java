package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.excecuteTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("shopping", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.PAINTING);
        shopping.excecuteTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("redecoration", shopping.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.DRIVING);
        shopping.excecuteTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("driving", shopping.getTaskName());
    }
}
