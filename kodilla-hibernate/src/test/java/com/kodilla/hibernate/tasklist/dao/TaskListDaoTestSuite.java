package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "Tasks list Hibernate";
    private static final String NAME = "First";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName= taskList.getListName();
        //When
        List<TaskList> listTask= taskListDao.findByListName(listName);
        //Then
        assertEquals(3, listTask.size());

        //CleanUp
        int id = listTask.get(0).getId();
        taskListDao.deleteById(id);
    }
}
