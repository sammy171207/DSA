package Dp;

public class SubsetWhichTargetEqualtoK {

    static boolean findsubsetequaltotarget(int idx, int[] arr, int target, Boolean[][] dp) {
        if (target == 0) return true;
        if (idx == 0) return arr[0] == target;

        if (dp[idx][target] != null) return dp[idx][target];

        boolean nonpick = findsubsetequaltotarget(idx - 1, arr, target, dp);
        boolean pick = false;

        if (arr[idx] <= target) {
            pick = findsubsetequaltotarget(idx - 1, arr, target - arr[idx], dp);
        }

        dp[idx][target] = nonpick || pick;
        return dp[idx][target];
    }

    static boolean canPartition(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        Boolean[][] dp = new Boolean[arr.length][target + 1];
        return findsubsetequaltotarget(arr.length - 1, arr, target, dp);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 5};
        System.out.println(canPartition(arr));  // true
    }
}
