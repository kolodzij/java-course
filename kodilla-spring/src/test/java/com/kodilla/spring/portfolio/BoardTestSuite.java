package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTaskTodoList("Task1");
        board.addTaskInProgress("Task2");
        board.addTaskDoneList("Task3");

        ArrayList<String> result = board.getToDoList().getTasksList();
        ArrayList<String> result2 = board.getInProgressList().getTasksList();
        ArrayList<String> result3 = board.getDoneList().getTasksList();
        String tekst = Stream.concat(Stream.concat(result.stream(),result2.stream()),result3.stream()).collect(Collectors.joining(", "));

        //Then
        Assert.assertEquals(1, board.getDoneList().getTasksList().size());
        Assert.assertEquals("Task1", board.getToDoList().getTasksList().stream().collect(Collectors.joining(", ")));
        Assert.assertEquals("Task1, Task2, Task3", tekst);
    }
}
