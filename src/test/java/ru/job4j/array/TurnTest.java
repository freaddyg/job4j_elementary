package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void backTest1() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = turner.back(input);
        int[] expect = new int[] {4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void backTest2() {
        Turn turner = new Turn();
        int[] input = new int[] {100, 200, 300, 400, 500};
        int[] result = turner.back(input);
        int[] expect = new int[] {500, 400, 300, 200, 100};
        assertThat(result, is(expect));
    }
}