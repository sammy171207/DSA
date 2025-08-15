package Dp;

import java.util.Arrays;

public class Robber_II {
    static int tabway(int[]robber){
        int n=robber.length;
        if(n==0) return 0;
        if(n==1) return robber[0];
        int[]dp=new int[n];
        dp[0]=robber[0];
        dp[1]=Math.max(robber[0],robber[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i - 1], robber[i] + dp[i - 2]);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        int []arr1= Arrays.copyOfRange(nums,0,nums.length-1);
        int[]arr2=Arrays.copyOfRange(nums,1,nums.length);
        int ans=tabway(arr1);
        int ans1=tabway(arr2);
        int result=Math.max(ans,ans1);
        System.out.println(result);


    }
}
