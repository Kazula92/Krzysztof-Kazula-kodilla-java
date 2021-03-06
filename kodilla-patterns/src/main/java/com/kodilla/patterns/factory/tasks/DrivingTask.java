package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks{

    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskDone= false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if(taskDone) {
            System.out.println("Tasks " + taskName + " was completed!");
        } else {
            System.out.println("Tasks " + taskName + " was NOT completed...");
            taskDone =true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskDone;
    }
}
