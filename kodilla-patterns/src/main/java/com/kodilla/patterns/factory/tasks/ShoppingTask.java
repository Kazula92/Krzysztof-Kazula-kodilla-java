package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskDone= false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
