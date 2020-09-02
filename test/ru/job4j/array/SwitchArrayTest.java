package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void swapTest03() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void swapTest24() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 5, 4, 3, 6};
        int[] rsl = SwitchArray.swap(input, 2, 4);
        assertThat(rsl, is(expect));
    }
}