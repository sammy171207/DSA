package Dp;

import java.util.ArrayList;
import java.util.List;

public class ClimbStair {
    static int cntway(int n,int idx,int[]memo){
        List<Integer>ans=new ArrayList<>();
        if(idx>n){
            return 0;
        }
        if(idx==n ){
            ans.add(idx);
            return 1;
        }
        if(memo[idx]!=0)return memo[idx];
        memo[idx]=cntway(n,idx+1,memo) + cntway(n,idx+2,memo);
        return  memo[idx];
    }
    public static void main(String[] args) {
        int n=2;
        int[] dp=new int[n+1];
        System.out.println(cntway(3,0,dp));
    }
}
