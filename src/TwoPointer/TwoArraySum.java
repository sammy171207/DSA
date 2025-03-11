package TwoPointer;

import java.util.LinkedList;

public class TwoArraySum {
    static LinkedList<Integer>sumofArray(int[]arr1, int[]arr2){
        LinkedList<Integer>ans=new LinkedList<>();
        int str=0,str1=arr2.length-1;
        while(str<=arr1.length-1 && str1>=0){
            ans.push(arr1[str] +arr2[str1]);
            str++;
            str1--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr1={15,21,2,13,44,48,33,6,15,44};
        int[]arr2={21,36,1,45,42,25,45,48,45,32};
        LinkedList<Integer>show=sumofArray(arr1,arr2);

        System.out.println(show.reversed());
    }
}
