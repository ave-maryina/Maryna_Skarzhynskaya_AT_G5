package homework_unitTests;

import org.junit.Assert;
import org.junit.Test;
import tasks.classwork.Calculator;

public class CalculatorTest {

    Calculator calc = new Calculator();
    @Test
    public void calculatorAddTest() {
        int sum = calc.add(4, 8);
        Assert.assertEquals("", 12, sum);
    }
    @Test
    public void calculatorSubtractTest() {
        int subtract = calc.subtract(18, 6);
        Assert.assertEquals("", 12, subtract);
    }
    @Test
    public void calculatorMultiplyTest() {
        int multiply = calc.multiply(3, 4);
        Assert.assertEquals("", 12, multiply);
    }
    @Test
    public void calculatorDivideTest() {
        int divide = calc.divide(9, 2);
        Assert.assertEquals("", 4, divide);
    }
    @Test(expected = ArithmeticException.class)
    public void calculatorDivideNullTest() {
        int divide = calc.divide(9, 0);
    }
}
