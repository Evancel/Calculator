package pro.sky.java.course2.calculatorproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculatorproject.exception.BadParamException;
import pro.sky.java.course2.calculatorproject.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String sayHello() {
        return service.sayHello();
    }

    @GetMapping("/plus")
    public String plus(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return a + " + " + b + " = " + service.plus(a, b);
    }

    @GetMapping("/minus")
    public String minus(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return a + " - " + b + " = " + service.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return a + " * " + b + " = " + service.multiply(a, b);
    }

    @GetMapping("/divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return a + " / " + b + " = " + service.divide(a, b);
    }
}
