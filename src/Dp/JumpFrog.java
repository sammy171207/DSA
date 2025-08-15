package Dp;

import java.util.Arrays;

public class JumpFrog {
    static  int minimumEnergy(int[]heights){
       int n=heights.length;
       int []memo=new int[n];
       Arrays.fill(memo,-1);
       return helper(n-1,heights,memo);
    }
    static int helper(int idx,int[]heights,int[]memo){
        if(idx==0) return 0;
        if(memo[idx]!=-1)return memo[idx];
        int jumpOne=helper(idx-1,heights,memo)+Math.abs(heights[idx]-heights[idx-1]);
        int jumpTwo=Integer.MAX_VALUE;
        if(idx>1){
            jumpTwo=helper(idx-1,heights,memo)+Math.abs(heights[idx]-heights[idx-2]);
        }
        return  memo[idx]=Math.min(jumpOne,jumpTwo);
    }

    static int tabulation(int[] heights, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i < heights.length; i++) {
            int oneStep = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int twoStep = Integer.MAX_VALUE;
            if (i > 1) {
                twoStep = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[heights.length - 1];
    }
    public static void main(String[] args) {
        int[]heights={2, 1, 3, 5, 4};
      System.out.println(minimumEnergy(heights));
        int []dp=new int[heights.length];

        System.out.println(tabulation(heights,dp));
    }
}
