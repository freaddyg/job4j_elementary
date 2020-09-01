package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void maxTest() {
        int result = Max.max(5, 17);
        Assert.assertThat(result, is(17));
    }
}