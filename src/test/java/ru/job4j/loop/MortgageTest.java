package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Mortgage;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void yearTest1() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void yearTest2() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }
}