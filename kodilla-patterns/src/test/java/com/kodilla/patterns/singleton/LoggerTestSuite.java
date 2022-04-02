package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void loggerTest () {
        logger = Logger.INSTANCE;
        logger.log("logger");

    }

    @Test
    void testLastLog () {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Opened test: " + lastLog);
        //Then
        assertEquals("logger", lastLog);
    }
}
