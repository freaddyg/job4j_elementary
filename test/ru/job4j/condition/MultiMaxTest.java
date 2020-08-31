package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void maxTest() {
        int result = MultiMax.max(0, 2, 4);
        assertThat(result, is(4));
    }
}