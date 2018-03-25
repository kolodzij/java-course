package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final List<Observer> observers;
    private final List<String> tasksList;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        tasksList=new ArrayList<>();
        this.name=name;
    }

    public void sendTask(String task) {
        tasksList.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasksList;
    }

    public String getName() {
        return name;
    }

}
