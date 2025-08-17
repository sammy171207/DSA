package Dp;

import java.util.Arrays;

public class MinimumCostPath {
    static int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][]dp=new int[n][m];
        for(int[]x:grid){
            Arrays.fill(x,-1);
            System.out.println(x);
        }

        return memoway(n - 1, m - 1, grid,dp);
    }

    static int memoway(int i, int j, int[][] grid, int[][] dp) {
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return Integer.MAX_VALUE;

        if (dp[i][j] != -1) return dp[i][j];

        int up = memoway(i - 1, j, grid, dp);
        int left = memoway(i, j - 1, grid, dp);

        int upCost = (up == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[i][j] + up;
        int leftCost = (left == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[i][j] + left;

        return dp[i][j] = Math.min(upCost, leftCost);
    }



    static int helper(int i, int j, int[][] grid) {
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return Integer.MAX_VALUE;

        int up = helper(i - 1, j, grid);
        int left = helper(i, j - 1, grid);
        int upCost = (up == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[i][j] + up;
        int leftCost = (left == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[i][j] + left;

        return Math.min(upCost, leftCost);
    }


    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

//        for (int[] row : grid) {
//            System.out.println(Arrays.toString(row));
//        }

       int sum=minCost(grid);
        System.out.println(sum);
    }
}
