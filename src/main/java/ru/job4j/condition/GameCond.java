package ru.job4j.condition;

import com.sun.source.tree.BreakTree;

public class GameCond {
    public static int checkGame(double percent, int prize, int pay) {
        double sum = prize * percent;
        if (sum > pay) {
           double res = sum - prize;
           return (int) res;
        }
        return 0;
    }
}
