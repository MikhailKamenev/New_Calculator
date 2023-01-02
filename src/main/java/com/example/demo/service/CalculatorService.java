package com.example.demo.service;

import com.example.demo.possibleExceptions.NumberIsNullException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greeting() {
        return "Welcome to Calculator";
    }

    public String sum(double num1, double num2) {
        isNull(num1,num2);//проверка на null
        double result = num1+num2;
        return num1+"+"+num2+"="+result;
    }

    public String subtract(double num1, double num2) {
        isNull(num1, num2);
        double result = num1-num2;
        return num1+"-"+num2+"="+result;
    }

    public String multiply(double num1, double num2) {
        isNull(num1, num2);
        double result = num1*num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(double num1, double num2) {
        isNull(num1, num2);
        if (num2 == 0) {
            throw new NumberIsNullException("Делить на ноль нельзя");
        }
        double result = num1/num2;
        return num1+"/"+num2+"="+result;
    }

    private void isNull(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new NumberIsNullException("Заполните все поля");
        }
    }
}
