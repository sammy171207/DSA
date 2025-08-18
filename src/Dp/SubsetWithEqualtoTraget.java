package Dp;

public class SubsetWithEqualtoTraget {
    // recursion
     static boolean sumofTarget(int idx,int target,int[]arr){
         if(target==0) return true;
         if(idx==0) return  arr[0]==target;
         boolean pick=false;
         if(arr[idx]<=target){
              pick=sumofTarget(idx-1,target-arr[idx],arr);
         }

         boolean notpick=sumofTarget(idx-1,target,arr);
         return pick|| notpick;
     }

     //memoway

    static boolean memoway (int idx,int target,int[]arr,boolean dp[][]){
        if(target==0) return true;
        if(idx==0) return  arr[0]==target;
        if (dp[idx][target] != null) return dp[idx][target];

        boolean pick=false;
        if(arr[idx]<=target){
            pick=sumofTarget(idx-1,target-arr[idx],arr);
        }

        boolean notpick=sumofTarget(idx-1,target,arr);
        dp[idx][target]=pick||notpick;
        return dp[idx][target];

    }

    static boolean subsetSumTabulation(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n][target + 1];

        // Base case: sum = 0 is always possible (by taking nothing)
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Base case: only using first element
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int t = 1; t <= target; t++) {
                boolean notPick = dp[i - 1][t];
                boolean pick = false;
                if (arr[i] <= t) {
                    pick = dp[i - 1][t - arr[i]];
                }
                dp[i][t] = pick || notPick;
            }
        }

        return dp[n - 1][target];
    }

    public static void main(String[] args) {
        int[]arr={1,2,7,3};
        boolean ans=sumofTarget(arr.length-1,6,arr);
        System.out.println(ans);
    }
}
