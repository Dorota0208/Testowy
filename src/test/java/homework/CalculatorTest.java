package homework;

import zadania.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSumPositiveNumbers() {
        int result = calculator.sum(5, 10);
        Assert.assertEquals(result, 15, "Sum of 5 and 10 should be 15");
    }

    @Test
    public void testSumNegativeNumbers() {
        int result = calculator.sum(-5, -10);
        Assert.assertEquals(result, -15, "Sum of -5 and -10 should be -15");
    }

    @Test
    public void testSubtractPositiveNumbers() {
        int result = calculator.subtract(10, 5);
        Assert.assertEquals(result, 5, "Subtracting 5 from 10 should be 5");
    }

    @Test
    public void testSubtractNegativeNumbers() {
        int result = calculator.subtract(-10, -5);
        Assert.assertEquals(result, -5, "Subtracting -5 from -10 should be -5");
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        int result = calculator.multiply(5, 10);
        Assert.assertEquals(result, 50, "Multiplication of 5 and 10 should ne 50");
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        int result = calculator.multiply(-5, -10);
        Assert.assertEquals(result, 50, "Multiplication of -5 and -10 should be 50");
    }

    @Test
    public void testDividePositiveNumbers() {
        int result = calculator.divide(10, 2);
        Assert.assertEquals(result, 5, "10 divided by 2 should be 5");
    }
    @Test
    public void testDivideNegativeNumbers() {
        int result = calculator.divide(-10, -2);
        Assert.assertEquals(result, 5, "-10 divided by -2 should be 5");
    }

    @Test
    public void testDivideByZero() {
        try {
            calculator.divide(10, 0);
            Assert.fail("Division by zero should throw an exception");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Division by zero is not permitted"));
        }
    }

}