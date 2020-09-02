package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void indexOfFind() {
        int[] num = new int[] {3, 7, 9, 11};
        int numb = 9;
        int exp = 2;
        int res = FindLoop.indexOf(num, numb);
        assertThat(res, is(exp));
    }

    @Test
    public void indexOfNoFind() {
        int[] num = new int[] {3, 7, 9, 11};
        int numb = 14;
        int exp = -1;
        int res = FindLoop.indexOf(num, numb);
        assertThat(res, is(exp));
    }
}