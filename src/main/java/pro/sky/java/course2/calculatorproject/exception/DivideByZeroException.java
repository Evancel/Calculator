package pro.sky.java.course2.calculatorproject.exception;

public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(){
        super("Dividing by zero is forbidden!");
    }
}
