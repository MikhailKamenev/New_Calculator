package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceParametrizedTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("sumTestSets")
    public void sumTest(double num1, double num2, double result) {
        Assertions.assertEquals(result, calculatorService.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("subtractTestSets")
    public void subtractTest(double num1, double num2, double result) {
        Assertions.assertEquals(result, calculatorService.subtract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyTestSets")
    public void multiplyTest(double num1, double num2, double result) {
        Assertions.assertEquals(result,calculatorService.multiply(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("divideTestSets")
    public void divideTest(double num1, double num2, double result) {
        Assertions.assertEquals(result,calculatorService.divide(num1,num2));
    }


    public static List<Arguments> sumTestSets() {
        return List.of(
                Arguments.of(3, 6, 9),
                Arguments.of(13, 5, 18),
                Arguments.of(2, 0, 2)
        );
    }
    public static List<Arguments> subtractTestSets() {
        return List.of(
                Arguments.of(3,6,-3),
                Arguments.of(13,5,8),
                Arguments.of(2,0,2)
        );
    }
    public static List<Arguments> multiplyTestSets() {
        return List.of(
                Arguments.of(3,6,18),
                Arguments.of(13,5,65),
                Arguments.of(2,0,0)
        );
    }
    public static List<Arguments> divideTestSets() {
        return List.of(
                Arguments.of(30,6,5),
                Arguments.of(-15,5,-3),
                Arguments.of(2,2,1)
        );
    }
}
