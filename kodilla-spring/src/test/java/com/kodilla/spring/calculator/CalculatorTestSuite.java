package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.add(2.3,4.2);
        calculator.sub(5.1, 2.1);
        calculator.mul(3.0,1.5);
        calculator.div(3.5,0.5);
        //Then
    }
}
