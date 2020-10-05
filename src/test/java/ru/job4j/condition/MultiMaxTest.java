package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void maxTest() {
        int result = MultiMax.max(7, 9, 4);
        assertThat(result, is(9));
    }
}