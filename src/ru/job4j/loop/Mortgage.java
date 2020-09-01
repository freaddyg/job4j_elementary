package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        amount = amount + amount * percent;

        while (amount > 0) {
           double remains = amount - salary;
           double remainsPer = (amount - salary) * percent;
           amount = remains + remainsPer;
           year++;
        }
        return year;
    }
}
