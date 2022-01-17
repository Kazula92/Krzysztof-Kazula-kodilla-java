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
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(10);

            //When
            shapeCollector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector.getShapeCollector().size());
        }

        @DisplayName("Checks for removing figures from the collection")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(10);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapeCollector().size());
        }

        @DisplayName("Checks the fetch from the figure collection")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(10);
            shapeCollector.addFigure(shape);

            //When
            Shape shapeResult = shapeCollector.getFigure(0);

            //Then
            assertEquals(shape, shapeResult);
        }

        @DisplayName("Checks for removal of non-existent figures")
        @Test
        public void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(11));

            //When
            boolean result = shapeCollector.removeFigure(new Circle(10));

            //Then
            assertFalse(result);
            assertEquals(1, shapeCollector.getShapeCollector().size());
        }

        @DisplayName("Checks the return of the name of all figures")
        @Test
        public void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(10);
            shapeCollector.addFigure(shape);
            ArrayList<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);

            //When
            List<Shape> shapeResultList = shapeCollector.getShapeCollector();

            //Then
            assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }
}
