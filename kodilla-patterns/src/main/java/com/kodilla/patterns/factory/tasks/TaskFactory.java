package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case PAINTING:
                return new PaintingTask("redecoration","blue","room");
            case SHOPPING:
                return new ShoppingTask("shopping", "milk",3);
            case DRIVING:
                return new DrivingTask("driving", "here", "xxx");
            default:
                return null;
        }

    }

}
