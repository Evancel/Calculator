package pro.sky.java.course2.calculatorproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String sayHello(){
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int a, int b){
        return a + " + " + b + " = " + (a+b);
    }
    public String minus(int a, int b){
        return a + " - " + b + " = " + (a-b);
    }
    public String multiply(int a, int b){
        return a + " * " + b + " = " + (a*b);
    }
    public String divide(int a, int b){
        if(b==0){
            return "Ошибка! Делить на ноль нельзя!";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }
}
