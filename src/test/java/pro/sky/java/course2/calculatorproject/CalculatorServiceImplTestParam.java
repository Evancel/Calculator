package pro.sky.java.course2.calculatorproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculatorproject.exception.BadParamException;
import pro.sky.java.course2.calculatorproject.exception.DivideByZeroException;
import pro.sky.java.course2.calculatorproject.service.CalculatorService;
import pro.sky.java.course2.calculatorproject.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculatorproject.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTestParam {
    private final CalculatorService out = new CalculatorServiceImpl();
    public static Stream <Arguments> provideParamForSuccessfulTestsExceptDivide() {
        return Stream.of(
                Arguments.of(A1, B1),
                Arguments.of(A2, B2),
                Arguments.of(A3, B3)
        );
    }

    public static Stream <Arguments> provideParamForSuccessfulTestsDivide() {
        return Stream.of(
                Arguments.of(A1, B1),
                Arguments.of(A2, B2)
        );
    }

    public static Stream <Arguments> provideParamForThrowExceptionsTests() {
        return Stream.of(
                Arguments.of(A4, B4),
                Arguments.of(A5, B5),
                Arguments.of(A6, B6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamForSuccessfulTestsExceptDivide")
    public void checkPlusMethod(Integer a, Integer b){
        Integer actual = a+b;
        Integer expected = out.plus(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamForSuccessfulTestsExceptDivide")
    public void checkMinusMethod(Integer a, Integer b){
        Integer actual = a+b;
        Integer expected = out.plus(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamForSuccessfulTestsExceptDivide")
    public void checkMultiplyMethod(Integer a, Integer b){
        Integer actual = a+b;
        Integer expected = out.plus(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamForSuccessfulTestsDivide")
    public void checkDivideMethod(Integer a, Integer b){
        Integer actual = a+b;
        Integer expected = out.plus(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamForThrowExceptionsTests")
    public void checkPlusMethodThrowsException(Integer a, Integer b){
        Assertions.assertThrows(BadParamException.class, ()->out.plus(a, b));
    }

    @Test
    public void checkDivideByZero(){
        Integer a = A3;
        Integer b = B3;

        Assertions.assertThrows(DivideByZeroException.class, ()->out.divide(a, b));
    }

    @Test
    public void checkHello(){
        Assertions.assertEquals(out.sayHello(),"Добро пожаловать в калькулятор");
    }
}
