package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //given
        Logger logger = Logger.INSTANCE;

        //when
        logger.log("Test");
        String result = logger.getLastLog();

        //then
        assertEquals("Test", result);
    }
}
