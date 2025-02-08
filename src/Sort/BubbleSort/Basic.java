package Sort.BubbleSort;

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

    static void reversesort(int[]arr,int n){
        if(n==1) return;
        for(int i=0;i<n-2;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        reversesort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = sort(arr);
        reversesort(arr,arr.length);
//        System.out.println(arr.toString());
        for(int x:arr){
            System.out.print(x+" ");
        }
//        System.out.println(Arrays.toString(ans));

    }
}
