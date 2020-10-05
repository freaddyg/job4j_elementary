package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(500);
        System.out.println("500 rubles are " + dollar + " $.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

           int inDollar = 500;
           int expectedDollar = 8;
           int outDollar = Converter.rubleToDollar(500);
           boolean passedDollar = expectedDollar == outDollar;
           System.out.println("500 rubles are 8. Test result : " + passedDollar);

    }
}
