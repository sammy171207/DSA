package Arrays;

import java.util.ArrayList;

public class PSC2 {
    static ArrayList<Integer>leader(int[]arr){
        ArrayList<Integer>result=new ArrayList<>();
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
                System.out.println(k++);
            }
            if(j==n){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={5, 10, 20, 40};
        ArrayList<Integer> print=leader(arr);
        for (int res : print) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
