package com.example.homework24.controller;

import com.example.homework24.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*calculation*/

@RestController
@RequiredArgsConstructor
public class CalculationController {

    private final CalculationService calculationService;

    @GetMapping("/calculation")
    public String welcome() {
        return "Добро пожаловать или посторонним вход воспрещён!";
    }
    @GetMapping("/calculation/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        int plus = calculationService.plus(num1, num2);
        return String.valueOf(num1 + " + " + num2 + " = " + plus);
    }

    @GetMapping("/calculation/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        int minus = calculationService.minus(num1, num2);
        return String.valueOf(num1 + " - " + num2 + " = " + minus);
    }

    @GetMapping("/calculation/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        int multiply = calculationService.multiply(num1, num2);
        return String.valueOf(num1 + " * " + num2 + " = " + multiply);
    }

    @GetMapping("/calculation/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        double divide = calculationService.divide(num1, num2);
        return String.valueOf(num1 + " / " + num2 + " = " + divide);
    }
}
