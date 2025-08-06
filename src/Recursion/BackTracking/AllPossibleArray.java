package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleArray {
        static void subsequence(int idx,int []arr,List<Integer>current,List<List<Integer>> result){
            if(idx==arr.length){
                result.add(new ArrayList<>(current));
                return;
            }
            current.add(arr[idx]);
            subsequence(idx+1,arr,current,result);
            current.remove(current.size()-1);
            subsequence(idx+1,arr,current,result);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3};
        List<Integer>subarr=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        subsequence(0,arr,subarr,result);
        System.out.println(result.toString());
    }
}
