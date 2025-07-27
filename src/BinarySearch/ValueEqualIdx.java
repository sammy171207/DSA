package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class ValueEqualIdx {
    static void valueidx(int[]arr){
        List<Integer>list=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==i+1){
               list.add(arr[i]);
           }
       }
       for(int num:list){
           System.out.println(num);
       }
    }
    public static void main(String[] args) {
        int []arr={15, 2, 45, 4 , 7};
        valueidx(arr);
    }
}
