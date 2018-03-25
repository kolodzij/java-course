package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student tasks) {
        System.out.println(name + ": New task " + tasks.getName() + "\n" +
                " (total: " + tasks.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getNameame() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
