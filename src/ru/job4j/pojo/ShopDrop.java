package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            products[index] = products[i + 1];
            products[i + 1] = null;
            break;
        }

        return products;
    }
}
