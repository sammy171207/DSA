package Dp;

import java.util.Arrays;

public class Robber_I {
    static  int maximumMoney(int[]robber,int idx){
        if (idx == 0) return robber[0];
        if (idx == 1) return Math.max(robber[0], robber[1]);

        int pick = robber[idx] + maximumMoney(robber, idx - 2);
        int notpick = maximumMoney(robber, idx - 1);

        return Math.max(pick, notpick);
    }

    //memoization mention
    static int memoway(int[]robber,int idx,int[]memo){
        if(idx==0) return robber[0];
        if(idx==1) return Math.max(robber[0],robber[1]);
        if(memo[idx]!=-1) return memo[idx];
        int pick=robber[idx]+memoway(robber,idx-2,memo);
        int notpick=memoway(robber,idx-1,memo);
        return memo[idx]=Math.max(pick,notpick);
    }

    //tabulation method
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
        int []robber={1,2,3,1};
       int ans= maximumMoney(robber,robber.length-1);
        System.out.println(ans);
        int []dp=new int[robber.length+1];
        Arrays.fill(dp,-1);
        System.out.println(memoway(robber,robber.length-1,dp));
        System.out.println(tabway(robber));
    }
}
