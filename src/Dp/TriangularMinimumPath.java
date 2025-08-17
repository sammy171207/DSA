package Dp;

import java.util.Arrays;

public class TriangularMinimumPath {
    static int minimumTriangle(int[][]grid){
        int col=grid.length;

        int [][]dp=new int[col][col];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return helper(0,0,grid,dp);
    }
    private static int helper(int i,int j,int[][]grid,int[][]dp){
        if(i==grid.length-1) return grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int down=helper(i+1,j,grid,dp);
        int diagonal=helper(i+1,j+1,grid,dp);
        return dp[i][j]=grid[i][j]+Math.min(down,diagonal);
    }
    public static void main(String[] args) {
        int[][]grid={{1},{1,2},{1,2,4}};
        int sum= minimumTriangle(grid);
        System.out.println(sum);
    }
}
