package Arrays;

import java.util.SplittableRandom;

public class CheckBasket {
    static boolean check(String[]arr,int n){
        int j=1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[j]){
                return false;
            }
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        String [] arr={"apple", "orange", "banana", "orange"};

        String [] arr1={"apple", "apple", "apple", "apple"};
        boolean ans2=check(arr1,arr.length);
        System.out.println(ans2);
        boolean ans=check(arr, arr.length);
        System.out.println(ans);
    }
}
