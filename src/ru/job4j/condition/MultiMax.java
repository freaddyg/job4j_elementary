package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first;

        if (result > second && result > third) {
            return result;
        } else if (second > result && second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}
