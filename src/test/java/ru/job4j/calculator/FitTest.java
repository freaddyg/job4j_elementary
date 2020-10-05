package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void manWeightTest176() {
            short in = 176;
            double expected = 87.4;
            double out = Fit.manWeight(in);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeightTest176() {
        short in = 176;
        double expected = 75.9;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}