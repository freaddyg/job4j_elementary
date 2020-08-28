package ru.job4j.condition;

public class SqArea {


    public static double square(int p, int k) {
        int heigth = p / (2*(k+1));
        int length = heigth * k;
        double rsl = heigth * length;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
