package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class AllSubarThatSumEqualtoTarget {
    static void subarrequaltosum(int idx,int []arr,List<Integer>current,List<List<Integer>>res,int s,int sum){
        if(idx==arr.length){
           if(sum==s){
               res.add(new ArrayList<>(current));
               return;
           }
           return;
        }
        current.add(arr[idx]);
        s+=arr[idx];
        subarrequaltosum(idx+1,arr,current,res,s,sum);
        current.remove(current.size() - 1);
        s -= arr[idx];
        subarrequaltosum(idx+1,arr,current,res,s,sum);
    }

    static void sumtoOdd(int idx,int []arr,List<Integer>current,List<List<Integer>>res,int s){
        if(idx==arr.length){
            if(s%2!=0){
                res.add(new ArrayList<>(current));
            }return;
        }
        current.add(arr[idx]);
        s+=arr[idx];
        sumtoOdd(idx+1,arr,current,res,s);
        current.remove(current.size()-1);
        s-=arr[idx];
        sumtoOdd(idx+1,arr,current,res,s);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,1,2};
        int sum=3;
        int initSum=0;
        List<Integer>li=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        subarrequaltosum(0,arr,li,res,initSum,sum);

//        sumtoOdd(0,arr,li,res,initSum);
                for (List<Integer> r : res) {
            System.out.println(r);
        };
        System.out.println(res.size());
    }
}
