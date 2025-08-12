package Greedy;

public class JumpII {
    static int jumpsecond(int[] arr) {
        return helper(arr, 0);
    }

    static int helper(int[] nums, int idx) {
        if (idx >= nums.length - 1) return 0;

        int minJump = Integer.MAX_VALUE;
        int maxStep = nums[idx];

        for (int i = 1; i <= maxStep; i++) {
            int nextIndex = idx + i;
            if (nextIndex < nums.length) {
                int jumps = helper(nums, nextIndex);
                if (jumps != Integer.MAX_VALUE) {
                    minJump = Math.min(minJump, jumps + 1);
                }
            }
        }

        return minJump;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(jumpsecond(arr));
    }
}