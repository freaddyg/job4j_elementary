package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first;

        return result > second && result > third ? result : second > third ? second : third;
    }

}
