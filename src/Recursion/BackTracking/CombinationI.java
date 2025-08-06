package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationI {
    static void allCombinationwhichformtarget(int idx,int[]arr,int target,List<Integer>current,List<List<Integer>>result){
        if(idx==arr.length){
            if(target==0){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(arr[idx]<=target){
            current.add(arr[idx]);
            allCombinationwhichformtarget(idx,arr,target-arr[idx],current,result);
            current.remove(current.size()-1);
        }
        allCombinationwhichformtarget(idx+1,arr,target,current,result);
    }
    public static void main(String[] args) {
        int[]arr={2, 3, 5, 4};
        List<Integer> current=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        allCombinationwhichformtarget(0,arr,7,current,list);
        for(List<Integer>li:list){
            System.out.println(li);
        }
        System.out.println("");

    }
}
