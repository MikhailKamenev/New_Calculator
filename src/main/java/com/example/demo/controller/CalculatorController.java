package com.example.demo.controller;

import com.example.demo.possibleExceptions.NumberIsNullException;
import com.example.demo.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doSomething")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return this.calculatorService.greeting();
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return this.calculatorService.sum(num1, num2);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return this.calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return this.calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return this.calculatorService.divide(num1, num2);
    }

    @ExceptionHandler(value = NumberIsNullException.class)
    public ResponseEntity<String> numberIsNullHandler(NumberIsNullException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
