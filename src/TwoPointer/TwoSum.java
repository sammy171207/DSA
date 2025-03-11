package TwoPointer;

import java.util.LinkedList;

public class TwoSum {

    static LinkedList<Integer> twosumarr(int[]arr,int target){
        LinkedList<Integer>ans=new LinkedList<>();
         int str=0;
         int end=arr.length-1;
         while (str<end){
             int sum=arr[str]+arr[end];
             if(sum==target){
                 ans.add(str+1);
                 ans.add(end+1);
                 return ans;
             }
             else if(sum<target){
                 str++;
             }else{
                 end--;
             }
         }
         ans.add(-1);
        return  ans;
    }

    static void swap(char[]arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= (char) temp;
    }
    static char[] reverseStr(String str){
        char[] charArray = str.toCharArray();
        int startidx=0;
        int endidx=str.length();
        while (startidx<endidx){
            swap(charArray,startidx,endidx);
            startidx++;
            endidx--;
        }
        return charArray;
    }
    public static void main(String[] args) {
//       int []arr={2,7,11,15};
//       int target=9;
//       LinkedList<Integer>ans= twosumarr(arr,target);
//        for(int x : ans){
//            System.out.print(x+" ");
//        }
        char[]reverse=reverseStr("hello");
        System.out.println(reverse);
    }
}
