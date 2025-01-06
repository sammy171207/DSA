package Recursion.Linear;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindTarget {

    static  boolean findtargetval(int[]arr,int idx, int target){
       if(idx>=arr.length)return false;
       if(arr[idx]==target) return true;
       return findtargetval(arr,idx+1,target);
    }

    static int findIndex(int []arr,int idx,int target){
        //base case
        if(idx>=arr.length){
            return -1;
        }
        //selfwork
        if(arr[idx]==target){
            return idx;
        }
        //recursion
       return findIndex(arr,idx+1,target);
    }

    static  void presentofInd(int[]arr,int idx,int target){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx +" ");
        }
        presentofInd(arr,idx+1,target);
    }

    static ArrayList<Integer> givenIdx(int []arr,int idx,int target){
        ArrayList<Integer>ans =new ArrayList<>();
        if(idx>=arr.length){
            return new ArrayList<Integer>();
        }

        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallans=givenIdx(arr,idx+1,target);
        ans.addAll(smallans);
        return ans;
    }

    public static void main(String[] args) {
       int []arr={1,2,3,4,4,4,5,6};
       boolean ans=findtargetval(arr,0,4);
        System.out.println(ans);
        int o=findIndex(arr,0,7);
        System.out.println(o);
        presentofInd(arr,0,4);

        ArrayList<Integer> out=new ArrayList<>();
        out=givenIdx(arr,0,4);
        System.out.println(out);
    }
}
