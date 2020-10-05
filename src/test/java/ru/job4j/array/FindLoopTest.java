package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

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

    @Test
    public void indexOfYes() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void indexOfNo() {
        int[] input = new int[] {5, 2, 10, 5, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}