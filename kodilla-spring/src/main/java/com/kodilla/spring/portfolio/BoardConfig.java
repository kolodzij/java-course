package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList taskToDo;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList taskInProgress;

    @Autowired
    @Qualifier("doneList")
    private TaskList taskDone;

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList createDoneList() {
        return new TaskList();
    }

    @Bean
    public Board GetBoard()
    {
        return new Board(taskToDo, taskInProgress, taskDone);
    }

}
