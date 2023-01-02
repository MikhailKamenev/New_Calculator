package com.example.demo.service;

import com.example.demo.possibleExceptions.NumberIsNullException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greeting() {
        return "Welcome to Calculator";
    }

    public double sum(double num1, double num2) {
        isNull(num1,num2);//проверка на null
        return num1+num2;
    }

    public double subtract(double num1, double num2) {
        isNull(num1, num2);
        return num1-num2;
    }

    public double multiply(double num1, double num2) {
        isNull(num1, num2);
        return num1*num2;
    }

    public double divide(double num1, double num2) {
        isNull(num1, num2);
        if (num2 == 0) {
            throw new NumberIsNullException("Делить на ноль нельзя");
        }
        return num1/num2;
    }

    private void isNull(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new NumberIsNullException("Заполните все поля");
        }
    }
}
