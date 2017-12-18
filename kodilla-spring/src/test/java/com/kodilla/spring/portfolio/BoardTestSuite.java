package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.stream.Collectors;


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

        String result = board.getAllTasks().stream()
                            .collect(Collectors.joining("; "));

        ArrayList<String> tasksListResult = board.getAllTasks();

        //Then
        Assert.assertEquals(3, tasksListResult .size());
        Assert.assertEquals("Task1; Task2; Task3", result);
    }
}
