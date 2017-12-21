package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskTodoList(String task) {
        toDoList.addTask(task);
    }

    public void addTaskInProgress(String task) {
        inProgressList.addTask(task);
    }

    public void addTaskDoneList(String task) {
        doneList.addTask(task);
    }

    public ArrayList<TaskList> getAllList() {
        ArrayList<TaskList> longList = new ArrayList<>();
        longList.add(toDoList);
        longList.add(inProgressList);
        longList.add(doneList);
        return longList;
    }
    public ArrayList<String> getAllTasks() {
        return getAllList().stream()
                .flatMap(s->s.getTasksList().stream())
                .collect(Collectors.toCollection(ArrayList::new));
    }


}
