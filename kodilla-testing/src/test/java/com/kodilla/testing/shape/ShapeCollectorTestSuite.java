package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {

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

    @Nested
    @DisplayName("Test in figures")
    class TestFigures {
        @DisplayName("Checks for adding figures to the collection")
        @Test
        void testAddFigure() {
            //Given
            ArrayList<Shape> shapeCollector = new ArrayList<Shape>();
            ShapeCollector collector = new ShapeCollector(shapeCollector);

            //When
            Shape shape = new Circle(10);
            collector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector.size());
        }

        @DisplayName("Checks for removing figures from the collection")
        @Test
        void testRemoveFigure() {
            //Given
            ArrayList<Shape> shapeCollector = new ArrayList<>();
            ShapeCollector collector = new ShapeCollector(shapeCollector);
            Shape shape = new Circle(10);
            collector.addFigure(shape);
            collector.addFigure(shape);

            //When
            boolean result = collector.removeFigure(shape);

            //Then
            assertTrue(result);
            assertEquals(1, shapeCollector.size());
        }

        @DisplayName("Checks the fetch from the figure collection")
        @Test
        void testGetFigure() {
            //Given
            ArrayList<Shape> shapeCollector = new ArrayList<Shape>();
            ShapeCollector collector = new ShapeCollector(shapeCollector);

            //When
            Shape shape = new Circle(10);
            collector.addFigure(shape);
            Shape shapeResult = collector.getFigure(0);

            //Then
            assertEquals(shape, shapeResult);
        }

        @DisplayName("Checks for removal of non-existent figures")
        @Test
        public void testRemoveFigureNotExisting() {
            //Given
            ArrayList<Shape> shapeCollector = new ArrayList<Shape>();
            ShapeCollector collector = new ShapeCollector(shapeCollector);
            Shape shape = new Circle(10);

            //When
            boolean result = collector.removeFigure(shape);

            //Then
            assertFalse(result);
        }

        @DisplayName("Checks the return of the name of all figures")
        @Test
        public void testShowFigure() {
            //Given
            ArrayList<Shape> shapeCollector = new ArrayList<>();
            ShapeCollector collector = new ShapeCollector(shapeCollector);
            Shape shape = new Circle(10);
            collector.addFigure(shape);

            //When
            int result = collector.showFigures();

            //Then
            assertEquals(1, result);
        }
    }
}
