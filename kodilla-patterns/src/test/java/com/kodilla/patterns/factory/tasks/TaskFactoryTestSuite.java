package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTasks() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks shopping = factory.makeTasks(TaskFactory.SHOPPING);
        //Then
        assertEquals("Birthday shopping", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks painting = factory.makeTasks(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("Painting the house", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Tasks driving = factory.makeTasks(TaskFactory.DRIVING);
        //Then
        assertEquals("Holiday", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());
    }
}
