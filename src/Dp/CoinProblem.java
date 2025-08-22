package Dp;

public class CoinProblem {
    static int minimumContainRequire(int idx,int []arr,int target){
        if(idx==0) return arr[0]==target?1:0;
        if(target==0)return 1;
        int notpick=minimumContainRequire(idx-1,arr,target);
        int pick=0;
        if(arr[idx]<=target){
            pick=minimumContainRequire(idx,arr,target-arr[idx]);
        }
        return pick+notpick;
    }
    public static void main(String[] args) {
        int[]arr={1,2,5};
        int n=arr.length-1;
        int amount=11;
        System.out.println(minimumContainRequire(n,arr,amount));

    }
}
