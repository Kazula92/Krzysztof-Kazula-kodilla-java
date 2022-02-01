package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatingTestStatistics {

        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

    @Test
    void calculateStatisticsTestAllZeros(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);
        calculatingStatistics.showStatistics();

        //Then
        assertEquals(0,calculatingStatistics.getNumberOfUsers());
        assertEquals(0,calculatingStatistics.getNumberOfPosts());
        assertEquals(0,calculatingStatistics.getNumberOfComments());
        assertEquals(0,calculatingStatistics.getAverageNumberOfPostsPerUser(),0);
        assertEquals(0,calculatingStatistics.getAverageNumberOfCommentsPerUser(),0);
        assertEquals(0,calculatingStatistics.getAverageNumberOfCommentsPerPost(),0);
    }

    @Test
    void calculateStatisticsTestUsersHundredAndPostsThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("Test ok");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);
        calculatingStatistics.showStatistics();

        //Then
        assertEquals(100, calculatingStatistics.getNumberOfUsers());
        assertEquals(1000, calculatingStatistics.getNumberOfPosts());
        assertEquals(0, calculatingStatistics.getNumberOfComments());
        assertEquals(10, calculatingStatistics.getAverageNumberOfPostsPerUser(),0);
        assertEquals(0, calculatingStatistics.getAverageNumberOfCommentsPerUser(),0);
        assertEquals(0, calculatingStatistics.getAverageNumberOfCommentsPerPost(),0);
    }

    @Test
    void calculateStatisticsTestNumberOfCommentsGreaterThanNumberOfPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("Test ok");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);
        calculatingStatistics.showStatistics();

        //Then
        assertEquals(100, calculatingStatistics.getNumberOfUsers());
        assertEquals(100, calculatingStatistics.getNumberOfPosts());
        assertEquals(1000, calculatingStatistics.getNumberOfComments());
        assertEquals(1, calculatingStatistics.getAverageNumberOfPostsPerUser(),0);
        assertEquals(10, calculatingStatistics.getAverageNumberOfCommentsPerUser(),0);
        assertTrue(calculatingStatistics.getAverageNumberOfCommentsPerPost() < 1);
    }

    @Test
    void calculateStatisticsTestNumberOfPostsGreaterThanNumberOfComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("Test ok");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);
        calculatingStatistics.showStatistics();

        //Then
        assertEquals(100, calculatingStatistics.getNumberOfUsers());
        assertEquals(1000, calculatingStatistics.getNumberOfPosts());
        assertEquals(100, calculatingStatistics.getNumberOfComments());
        assertEquals(10, calculatingStatistics.getAverageNumberOfPostsPerUser(),0);
        assertEquals(1, calculatingStatistics.getAverageNumberOfCommentsPerUser(),0);
        assertTrue(calculatingStatistics.getAverageNumberOfCommentsPerPost() < 1);
    }
}
