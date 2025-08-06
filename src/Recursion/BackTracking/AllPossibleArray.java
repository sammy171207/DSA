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

    static  void allPossiblefromn(int idx,int n,List<Integer>current,List<List<Integer>>result){
            if(idx==n){
                result.add(new ArrayList<>(current));
                return;
            }
            current.add(idx);
            allPossiblefromn(idx+1,n,current,result);
            current.remove(current.size()-1);
            allPossiblefromn(idx+1,n,current,result);
    }
    public static void main(String[] args) {
//        int[]arr={1,2,3};
        List<Integer>subarr=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();

//        subsequence(0,arr,subarr,result);
        int n=3;
        System.out.println(result.toString());
        allPossiblefromn(0,n,subarr,result);

        for(List<Integer>li:result){
            System.out.println(li);
        }

        System.out.println();
    }
}
