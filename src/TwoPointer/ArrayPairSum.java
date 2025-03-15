package TwoPointer;

import java.util.LinkedList;

public class ArrayPairSum {
    static LinkedList<Integer> arrayPair(int[]arr){
        LinkedList<Integer>ans=new LinkedList<>();
        int str=0,end=arr.length-1;
        while(str<end){
            ans.add(arr[str]+arr[end]);
            str++;
            end--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={9,38,13,7,19,32,49,44,27,46};
        LinkedList<Integer> show=arrayPair(arr);
        System.out.println(show);
    }
}
