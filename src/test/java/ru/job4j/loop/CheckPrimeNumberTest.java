package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void checkTest5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void checkTest9() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkTest10() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }
}