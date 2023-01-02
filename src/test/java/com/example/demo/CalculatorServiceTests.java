package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void sumTest() {
        double num1 = 14;
        double num2 = 4;
        double sum = num1+num2;
        String result = num1+"+"+num2+"="+sum;

        Assertions.assertEquals(result,calculatorService.sum(num1,num2));
    }
}
