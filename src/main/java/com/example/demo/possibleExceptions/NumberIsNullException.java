package com.example.demo.possibleExceptions;

public class NumberIsNullException extends IllegalArgumentException {
    public NumberIsNullException(String s) {
        super(s);
    }
}
