package Arrays;

import java.util.SplittableRandom;

public class CheckBasket {
    static boolean check(String[]arr,int n){
        int j=1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String [] arr={"apple", "orange", "banana", "orange"};
        boolean ans=check(arr, arr.length);
        System.out.println(ans);
    }
}
