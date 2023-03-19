package pro.sky.java.course2.calculatorproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculatorproject.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;
    public CalculatorController(CalculatorService service){
        this.service = service;
    }

    @GetMapping
    public String sayHello(){
        return service.sayHello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam ("num1") int a, @RequestParam ("num2") int b){
        return service.plus(a,b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam ("num1") int a, @RequestParam ("num2") int b){
        return service.minus(a,b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam ("num1") int a, @RequestParam ("num2") int b){
        return service.multiply(a,b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam ("num1") int a, @RequestParam ("num2") int b){
        return service.divide(a,b);
    }
}
