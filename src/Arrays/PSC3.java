package Arrays;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;

public class PSC3 {
        static ArrayList<Integer>subarraysum(int[]arr,int target){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                     sum+=arr[k];
                     if(sum==target){
                         ans.add(i+1);
                         ans.add(j+1);
                         return ans;
                     }
                }
            }
        }
       ans.add(-1);
       return ans;
    }

        static ArrayList<Integer> approach2(int []arr,int target){
            ArrayList<Integer>result=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                int sum=0;
                for(int j=i;j<arr.length;j++){
                    sum+=arr[j];
                    if(sum==target){
                        result.add(i+1);
                        result.add(j+1);
                        return result;
                    }
                }
            }
            result.add(-1);
            return result ;
        }

    static int longestSubarray(int[] arr,int o) {
         int longsublen=0;
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               int sum=0;  int cnt=0;
               for(int k=i;k<=j;k++){
                   sum+=arr[k];
                   System.out.print(arr[k] +" ");

                   cnt++;
                   if(sum==o){
                       if(longsublen<cnt){
                           longsublen=cnt;
                       }
                   }


               }

               System.out.println("sum "+sum);
           }
       }
        return longsublen;
    }
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 7, 5};
//        int target=12;
//        ArrayList<Integer> ans = approach2(arr,target);
//         for(int x:ans){
//             System.out.print(x+" ");
//         }
        int arr[] = {10, -10, 20, 30} ;
        int target=5;
        longestSubarray(arr,target);
    }
}
