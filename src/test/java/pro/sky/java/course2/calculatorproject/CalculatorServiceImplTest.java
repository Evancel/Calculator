package pro.sky.java.course2.calculatorproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculatorproject.exception.BadParamException;
import pro.sky.java.course2.calculatorproject.exception.DivideByZeroException;
import pro.sky.java.course2.calculatorproject.service.CalculatorService;
import pro.sky.java.course2.calculatorproject.service.CalculatorServiceImpl;

import static pro.sky.java.course2.calculatorproject.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void checkHello(){
        Assertions.assertEquals(out.sayHello(),"Добро пожаловать в калькулятор");
    }
    @Test
    public void checkPlusPositiveNumbers(){
        Integer a = A1;
        Integer b = B1;

        Integer expected = out.plus(a,b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkPlusNegativeNumbers(){
        Integer a = A2;
        Integer b = B2;

        Integer expected = out.plus(a, b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPlusOneOfNumbersEqualsNull(){
        Integer a = A5;
        Integer b = B5;

        Assertions.assertThrows(BadParamException.class, ()->out.plus(a, b));
    }

    @Test
    public void checkMinusPositiveNumbers(){
        Integer a = A1;
        Integer b = B1;

        Integer expected = out.minus(a,b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkMinusNegativeNumbers(){
        Integer a = A2;
        Integer b = B2;

        Integer expected = out.minus(a, b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMinusOneOfNumbersEqualsNull(){
        Integer a = A5;
        Integer b = B5;

        Assertions.assertThrows(BadParamException.class, ()->out.minus(a, b));
    }

    @Test
    public void checkMultiplyPositiveNumbers(){
        Integer a = A1;
        Integer b = B1;

        Integer expected = out.multiply(a,b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkMultiplyNegativeNumbers(){
        Integer a = A2;
        Integer b = B2;

        Integer expected = out.multiply(a, b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMultiplyOneOfNumbersEqualsNull(){
        Integer a = A5;
        Integer b = B5;

        Assertions.assertThrows(BadParamException.class, ()->out.multiply(a, b));
    }

    @Test
    public void checkDividePositiveNumbers(){
        Integer a = A1;
        Integer b = B1;

        Integer expected = out.divide(a,b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkDivideNegativeNumbers(){
        Integer a = A2;
        Integer b = B2;

        Integer expected = out.divide(a, b);
        Integer actual = a+b;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkDivideOneOfNumbersEqualsNull(){
        Integer a = A5;
        Integer b = B5;

        Assertions.assertThrows(BadParamException.class, ()->out.divide(a, b));
    }
    @Test
    public void checkDivideByZero(){
        Integer a = A3;
        Integer b = B3;

        Assertions.assertThrows(DivideByZeroException.class, ()->out.divide(a, b));
    }
}
