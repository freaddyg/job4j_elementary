package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void findMinFirst() {
        assertThat(MinDiapason.findMin(new int[] {-1, 0, -2, 10}, 1, 3), is(-2));
    }

    @Test
    public void findMinLast() {
        assertThat(MinDiapason.findMin(new int[] {11, 3, 15, 0, 18}, 1, 3), is(0));
    }

    @Test
    public void findMinMid() {
        assertThat(MinDiapason.findMin(new int[] {-1, 0, 5, 10, 4, -5, 8}, 2, 5), is(-5));
    }
}