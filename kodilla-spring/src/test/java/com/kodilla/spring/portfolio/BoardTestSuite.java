package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String board1= "toDoList";
        String board2= "inProgressList";
        String board3= "doneList";

        //When
        board.getToDoList().getTasks().add("toDoList");
        board.getInProgressList().getTasks().add("inProgressList");
        board.getDoneList().getTasks().add("doneList");

        //Then
        assertEquals(1,board.getToDoList().getTasks().size());
        assertEquals(1,board.getInProgressList().getTasks().size());
        assertEquals(1,board.getDoneList().getTasks().size());
        assertEquals(board1, board.getToDoList().getTasks().get(0));
        assertEquals(board2,board.getInProgressList().getTasks().get(0));
        assertEquals(board3,board.getDoneList().getTasks().get(0));
    }
}
