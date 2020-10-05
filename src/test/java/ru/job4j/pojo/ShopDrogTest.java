package ru.job4j.pojo;

import org.junit.Test;
import ru.job4j.pojo.Product;
import ru.job4j.pojo.ShopDrop;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShopDrogTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Juce", 7);
        products[3] = new Product("Lemon", 9);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[1].getName(), is("Juce"));
        assertThat(rsl[3], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
       Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }
}