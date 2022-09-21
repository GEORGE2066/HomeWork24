package com.example.homework24.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*calculation*/

@RestController
@RequiredArgsConstructor
public class CalculationController {
    @GetMapping("/calculation")
    public String welcome() {
        return "Добро пожаловать или посторонним вход воспрещён!";
    }
    @GetMapping("/calculation/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return String.valueOf(num1 + " + " + num2 + " = " + String.valueOf(num1 + num2));
    }

    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return String.valueOf(num1 + " - " + num2 + " = " + String.valueOf(num1 - num2));
    }

    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return String.valueOf(num1 + " * " + num2 + " = " + String.valueOf(num1 * num2));
    }

    public String divide(Integer num1, Integer num2) {
        return String.valueOf(num1 + " / " + num2 + " = " + String.valueOf(num1 / num2));
    }
}
