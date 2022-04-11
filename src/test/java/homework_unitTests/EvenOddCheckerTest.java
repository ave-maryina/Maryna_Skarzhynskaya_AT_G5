package homework_unitTests;

import org.junit.Assert;
import org.junit.Test;
import tasks.classwork.EvenOddChecker;

public class EvenOddCheckerTest {
    @Test
    public void evenNumberTest() {
        Assert.assertEquals("", true, EvenOddChecker.check(8));
    }
//    @Test
//    public void nullTest() {
//        Assert.assertEquals("", true, EvenOddChecker.check(0));
//    }
    @Test
    public void oddNumberTest() {
        Assert.assertEquals("", false, EvenOddChecker.check(17));
    }
}
