package Dp;

public class CountsubquenceEqualtoK {
    static int cnttargetArr(int[]arr,int target){
        int n=arr.length;
        return cnt(n-1,target,arr);
    }
    static int cnt(int idx,int target,int[]arr){
        if(target==0)return 1;
        if(idx==0) return arr[idx]==target?1:0;
        int notpick=cnt(idx-1,target,arr);
        int pick=0;
        if(arr[idx]<=target){
            pick=cnt(idx-1,target-arr[idx],arr);
        }
        return pick+notpick;
    }
    public static void main(String[] args) {
        int[]arr={2, 3, 5, 16, 8, 10};
        int[]arr1={5,5,5};
        int tar=3;
        int target=10;
        int cnt=cnttargetArr(arr,target);
        System.out.println(cnttargetArr(arr1,tar));
        System.out.println(cnt);
    }
}
