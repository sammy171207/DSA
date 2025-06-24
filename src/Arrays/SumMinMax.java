package Arrays;

import java.util.Arrays;

public class SumMinMax {

    public  static  void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void minmax(int[]arr,int n){

        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int minmax=max+min;
        System.out.println(minmax);

    }

    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,6,6 };
        int[]arr1={-1,-4,5,8,9,3};
        int[]arr2={-1};
        int n=arr.length;
//         minmax(arr,n);
         minmax(arr2,arr2.length);

    }
}
