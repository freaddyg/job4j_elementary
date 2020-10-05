package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.SwitchWeek;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayTest() {

        SwitchWeek days = new SwitchWeek();
        String res = days.nameOfDay(5);
        assertThat(res, is("Пятница"));

    }
}