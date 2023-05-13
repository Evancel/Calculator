package pro.sky.java.course2.calculatorproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.java.course2.calculatorproject.exception.BadParamException;
import pro.sky.java.course2.calculatorproject.exception.DivideByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String sayHello(){
        return "Добро пожаловать в калькулятор";
    }
    public Integer plus(Integer a, Integer b){
        if(a ==null || b==null){
            throw new BadParamException("Input two correct arguments num1 and num2.");
        }
        return a+b;
    }
    public Integer minus(Integer a, Integer b){
        if(a ==null || b==null){
            throw new BadParamException("Input two correct arguments num1 and num2.");
        }
        return a-b;
    }
    public Integer multiply(Integer a, Integer b){
        if(a ==null || b==null){
            throw new BadParamException("Input two correct arguments num1 and num2.");
        }
        return a*b;
    }
    public Integer divide(Integer a, Integer b){
        if(a ==null || b==null){
            throw new BadParamException("Input two correct arguments num1 and num2.");
        } else if(b.equals(0)) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}
