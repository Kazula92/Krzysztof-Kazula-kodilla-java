package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Checking the correctness of the program when the list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<Integer>();

        //When

        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing the empty list");

        //Then
        Assertions.assertEquals(emptyList, resultList);

    }

    @DisplayName("Checking program when the list contains even and odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(5);
        normalList.add(7);
        normalList.add(10);
        normalList.add(12);
        normalList.add(9);
        normalList.add(4);

        //When
        List<Integer> actualResult = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing " + actualResult);


        //Then
        Assertions.assertEquals(Arrays.asList(10, 12, 4), actualResult);
    }

}

