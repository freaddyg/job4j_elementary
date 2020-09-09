package ru.job4j.pojo;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License("d", "v", "b", new Date());
        License second = new License("d", "v", "b", new Date());

        assertThat(first, is(second));
    }
}