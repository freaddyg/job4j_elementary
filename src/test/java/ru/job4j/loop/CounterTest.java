package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumByEvenTest30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEvenTest2550() {
        int rsl = Counter.sumByEven(0, 100);
        int expected = 2550;
        assertThat(rsl, is(expected));
    }
}