package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if  (i + 1 == products.length) {
                products[products.length - 1] = null;
                break;
            }
            products[i] = products[i + 1];
        }

        return products;
    }
}
