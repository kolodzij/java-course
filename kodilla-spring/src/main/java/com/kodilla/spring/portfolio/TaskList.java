package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {
    ArrayList<String> tasksList;

    public TaskList() {
        this.tasksList = new ArrayList<>() ;
    }

    public ArrayList<String> addTask(String task) {
        tasksList.add(task);
        return tasksList;
    }

    public ArrayList<String> getTasksList() {
        return tasksList;
    }
}
