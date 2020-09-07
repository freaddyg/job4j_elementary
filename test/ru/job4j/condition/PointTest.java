package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distanseTest2D() {
        int expected = 2;
        Point first = new Point(2, 0);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanseTest3D() {
        double expected = 2.8;
        Point first = new Point(2, 0, 6);
        Point second = new Point(0, 2, 4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.1);
    }
}