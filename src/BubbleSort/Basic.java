package BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Basic {
    static int [] sort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                //have swap happen
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));

    }
}
