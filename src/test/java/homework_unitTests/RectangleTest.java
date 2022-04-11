package homework_unitTests;

import org.junit.Assert;
import org.junit.Test;
import tasks.classwork.Rectangle;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(15.7,5.0);
    @Test
    public void rectangleAreaTest() {
        Assert.assertEquals("", 78.5, rectangle.getArea(), 0.05);
    }
    @Test
    public void rectangleDefaultLengthTest() {
        Assert.assertEquals("", 15.7, rectangle.getLength(), 0.05);
    }
    @Test
    public void rectangleDefaultWidthTest() {
        Assert.assertEquals("", 5.0, rectangle.getWidth(), 0.05);
    }
    @Test
    public void rectangleSetterLengthTest() {
        rectangle.setLength(17.8);
        Assert.assertEquals("", 17.8, rectangle.getLength(), 0.05);
    }
    @Test
    public void rectangleSetterWidthTest() {
        rectangle.setWidth(7.7);
        Assert.assertEquals("", 7.7, rectangle.getWidth(), 0.05);
    }
}
