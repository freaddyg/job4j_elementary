package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Min;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findMinFisrt() {
        assertThat(Min.findMin(new int[] {0, 5, 10}), is(0));
    }

    @Test
    public void findMinLast() {
        assertThat(Min.findMin(new int[] {10, 5, 3}), is(3));
    }

    @Test
    public void findMinMiddle() {
        assertThat(Min.findMin(new int[] {10, 2, 5}), is(2));
    }
}