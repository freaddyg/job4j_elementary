package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if  (index == products.length - 1) {
                break;
            }
            products[index] = products[index + 1];
        }
        products[products.length - 1] = null;

        return products;
    }
}
