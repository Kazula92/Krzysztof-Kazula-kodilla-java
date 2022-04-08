package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Tasks makeTasks(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Birthday shopping", "champagne", 4);
            case PAINTING:
                return new PaintingTask("Painting the house", "yellow", "walls");
            case DRIVING:
                return new DrivingTask("Holiday", "Alps", "car");
            default:
                return null;
        }
    }
}
