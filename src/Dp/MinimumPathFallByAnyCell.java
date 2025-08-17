package Dp;

public class MinimumPathFallByAnyCell {
    static int minimum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        // Initialize dp with -1 (unvisited)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min = Math.min(min, shortestPath(0, j, grid, dp));
        }
        return min;
    }

    static int shortestPath(int i, int j, int[][] grid, int[][] dp) {
        int n = grid.length;
        int m = grid[0].length;

        // Out of bounds
        if (j < 0 || j >= m) return Integer.MAX_VALUE;

        // Base case: last row
        if (i == n - 1) return grid[i][j];

        // Already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Recursive calls (down, down-left, down-right)
        int down = shortestPath(i + 1, j, grid, dp);
        int dgLeft = shortestPath(i + 1, j - 1, grid, dp);
        int dgRight = shortestPath(i + 1, j + 1, grid, dp);

        return dp[i][j] = grid[i][j] + Math.min(down, Math.min(dgLeft, dgRight));
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}
        };
        System.out.println(minimum(matrix));
    }
}
