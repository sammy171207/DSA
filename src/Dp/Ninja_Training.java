package Dp;

import java.util.Arrays;

public class Ninja_Training {

    static int maximumCredit(int[][] ninja, int day, int last) {
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < ninja[0].length; i++) {
                if (i != last) {
                    max = Math.max(max, ninja[day][i]);
                }
            }
            return max;
        }

        int max = 0;
        for (int i = 0; i < ninja[0].length; i++) {
            if (i != last) {
                int point = ninja[day][i] + maximumCredit(ninja, day - 1, i);
                max = Math.max(max, point);
            }
        }
        return max;
    }

    static int memoway(int[][] ninja, int day, int last, int[][] memo) {
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < ninja[0].length; i++) {
                if (i != last) {
                    max = Math.max(ninja[0][i], max);
                }
            }
            return max;
        }

        if (memo[day][last] != -1) return memo[day][last];

        int max = 0;
        for (int i = 0; i < ninja[0].length; i++) {
            if (i != last) {
                int point = ninja[day][i] + memoway(ninja, day - 1, i, memo);
                max = Math.max(max, point);
            }
        }

        return memo[day][last] = max;
    }

    public static void main(String[] args) {
        int[][] ninja = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };

        int[][] dp = new int[ninja.length][4];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println("Memoized Result: " + memoway(ninja, 2, 3, dp));
        System.out.println("Recursive Result: " + maximumCredit(ninja, 2, 3));
    }
}