package homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberAdditionTest {
    private int result = 0;

    @Test
    public void addNumber() {
        result += 5;
    }
    @Test (dependsOnMethods = "addNumber")
    public void checkResult() {
        Assert.assertEquals(result, 5, "The result should be 5 after adding.");
    }
}
