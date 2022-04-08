package com.kodilla.patterns.factory.tasks;


public class PaintingTask implements Tasks{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskDone= false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
