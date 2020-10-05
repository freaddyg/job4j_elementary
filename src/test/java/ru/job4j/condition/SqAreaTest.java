package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void squareTestWhenAr2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void squareTestWhenAr1() {
        int expected = 1;
        int p = 7;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void squareTestWhenAr3() {
        int expected = 3;
        int p = 11;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}