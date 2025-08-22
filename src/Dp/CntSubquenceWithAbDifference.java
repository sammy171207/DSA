package Dp;

import java.util.Arrays;

public class CntSubquenceWithAbDifference {
    //recursive way
    static  int cnt(int idx,int []arr,int target) {
        if (target == 0) return 1;
        if (idx == 0) {
            if (arr[0] == target) return 1;
            return 0;
        }
        int notPick=cnt(idx-1,arr,target);
//        System.out.println(target);
        int pick=0;
        if(arr[idx]<=target){
            pick=cnt(idx-1,arr,target-arr[idx]);
//            System.out.println(target);
        }
        return pick+notPick;
    }

    static  int memoway(int idx,int[]arr,int target,int [][]dp){
        if (target == 0) return 1;
        if (idx == 0) {
            if (arr[0] == target) return 1;
            return 0;
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        int notPick=cnt(idx-1,arr,target);
        int pick=0;
        if(arr[idx]<=target){
            pick=cnt(idx-1,arr,target-arr[idx]);
        }
        dp[idx][target]=pick+notPick;
        return dp[idx][target];

    }
    public static void main(String[] args) {
        int[]arr={1, 1, 2, 3};
        int differ=1;
        int n=arr.length;
        int totalsum=0;
        for(int x:arr){
            totalsum+=x;
        }


        int target=(totalsum+differ)/2;
        int[][]dp=new int[n][target+1];

        System.out.println(target);
       System.out.println(cnt(n-1,arr,target));
        System.out.println("memoway "+memoway(n-1,arr,target,dp));

    }
}
