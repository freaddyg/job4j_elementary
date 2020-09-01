package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimerNumberTest {

    @Test
    public void calcTest5() {
        int count = PrimerNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void calcTest11() {
        int count = PrimerNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void calcTest2() {
        int count = PrimerNumber.calc(2);
        assertThat(count, is(1));
    }
}