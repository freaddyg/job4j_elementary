package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.EndsWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void endsWithTestTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void endsWithTestFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}