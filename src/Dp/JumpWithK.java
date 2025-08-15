package Dp;

import java.util.Arrays;

public class JumpWithK {
    static  int minimumEnergy(int[]height,int k,int[]dp){
        int n=height.length;
        dp[0]=0;

        for(int i=1;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    min = Math.min(min, jump);
                }

            }
            dp[i]=min;
        }
       return dp[n-1];
    }
    public static void main(String[] args) {
        int[] height={15, 4, 1, 14, 15};
        int []dp=new int[height.length];
        Arrays.fill(dp,-1);
        int k=3;
        System.out.println(minimumEnergy(height,k,dp));
    }
}
