package BinarySearch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FloorandCeil {

    static int floor(int []arr,int target){
        int low=0,high=arr.length-1;
        int floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return  floor;
    }

    static int ceil(int[]arr,int target){
        int low=0,high=arr.length-1;
        int ceil=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ceil=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ceil;
    }
    static List<Integer> getfloorandceil(int[]arr, int target){
        List<Integer> ans= new ArrayList<>();

        int floorVal = floor(arr, target);
        int ceilVal = ceil(arr, target);

        ans.add(floorVal);
        ans.add(ceilVal);
        return ans;
    }
    public static void main(String[] args) {
        int [] nums={3, 4, 4, 7, 8, 10};
        int x=5;
    List<Integer>floorCeil=getfloorandceil(nums,x);
        System.out.println("Floor and Ceil of " + x + ": " + floorCeil);

    }
}
