package Arrays;

import java.util.Arrays;

public class MInimizeHeight {
    static  int minimumheight(int[]arr,int k){
        Arrays.sort(arr);
        int n=arr.length;
        int res=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<0) continue;
            int minHeight=Math.min(arr[0]+k,arr[i]-k);
            int maxHeight=Math.max(arr[i-1]+k,arr[n-1]-k);
            res=Math.min(res,maxHeight-minHeight);
        }
        return  res;
    }
    public static void main(String[] args) {
        int []arr={1, 5, 8, 10};
        int k=2;
       int sol= minimumheight(arr,k);
    }
}
