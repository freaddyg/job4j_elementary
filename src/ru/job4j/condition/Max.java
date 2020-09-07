package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(second, third);
        return max(first, result);
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(third, fourth);
        int tmp = max(result, second);
        return max(tmp, first);
    }
}
