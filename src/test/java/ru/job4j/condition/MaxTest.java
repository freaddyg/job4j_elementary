package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void maxTest2() {
        int result = Max.max(5, 17);
        Assert.assertThat(result, is(17));
    }

    @Test
    public void maxTest3() {
        int result = Max.max(5, 17, 30);
        Assert.assertThat(result, is(30));
    }

    @Test
    public void maxTest4() {
        int result = Max.max(5, 17, 15, 88);
        Assert.assertThat(result, is(88));
    }
}