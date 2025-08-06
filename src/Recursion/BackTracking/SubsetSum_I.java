package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum_I {
    static void subofSubset(int idx, int[] arr, int sum, List<Integer> list){
        if(idx==arr.length){
            list.add(sum);
            return;
        }

        subofSubset(idx+1,arr,sum+arr[idx],list);
        subofSubset(idx+1,arr,sum,list);
    }
    public static void main(String[] args) {
        int[]arr={2,3,4};
        int sum=0;
        List<Integer> sumofsubset=new ArrayList<>();
        subofSubset(0,arr,sum,sumofsubset);
        for(int x : sumofsubset){
            System.out.print(x+" ");
        }
    }
}
