package ru.job4j.condition;

import java.util.Arrays;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int res = 0;
        int res1 = 0;
        int res2 = 0;
        int money = 10;
        int moneyS = 15;
        int[] arr1 = Arrays.copyOfRange(hours, 0, 5);
        int[] arr2 = Arrays.copyOfRange(hours, 5, 7);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= 8) {
                res1 += arr1[i] * money;
            } else if (arr1[i] > 8) {
                int hour = (arr1[i] - 8) * moneyS;
                res1 += (money * 8) + hour;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] <= 8) {
                res2 += arr2[i] * 20;
            } else if (arr2[i] > 8) {
                int hour = (arr2[i] - 8) * 30;
                res2 += 20 * 8 + hour;
            }
        }
        res = res1 + res2;

        return res;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};

      int res = calculate(hours);

           System.out.println(res);

    }
}
