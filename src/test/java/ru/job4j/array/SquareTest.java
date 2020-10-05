package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateTest4() {
        int bound = 4;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9};
        assertThat(rst, is(expect));
    }

    @Test
    public void calculateTest5() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}