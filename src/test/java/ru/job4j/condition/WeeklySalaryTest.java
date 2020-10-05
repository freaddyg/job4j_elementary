package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.WeeklySalary;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WeeklySalaryTest {

    @Test
    public void calculate() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(690));
    }

}