package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Fitnes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FitnesTest {

    @Test
    public void calcTest() {
        int month = Fitnes.calc(80, 90);
        assertThat(month, is(1));
    }

    @Test
    public void calcTest1() {
        int month = Fitnes.calc(90, 90);
        assertThat(month, is(1));
    }
}