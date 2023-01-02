package com.example.demo;

import com.example.demo.possibleExceptions.NumberIsNullException;
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

    @Test
    public void minusTest() {
        double num1=20;
        double num2=15;
        double result = 5;
        String minus = num1 + "-" + num2 + "=" + result;
        Assertions.assertEquals(minus,calculatorService.subtract(num1,num2));
    }
    @Test
    public void multiplyTest() {
        double num1=4;
        double num2=5;
        double result = 20;
        String multiply = num1 + "*" + num2 + "=" + result;
        Assertions.assertEquals(multiply,calculatorService.multiply(num1,num2));
    }
    @Test
    public void divideTest() {
        double num1=20;
        double num2=5;
        double result = 4;
        String divide = num1 + "/" + num2 + "=" + result;
        Assertions.assertEquals(divide,calculatorService.divide(num1,num2));
    }
    @Test
    public void divideIfZeroTest() {
        Assertions.assertThrows(NumberIsNullException.class,()->{calculatorService.divide(3,0);});
    }
}
