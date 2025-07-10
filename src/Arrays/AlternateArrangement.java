package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternateArrangement {
    static int[] arrangebysign(int[]arr){
        List<Integer>negative=new ArrayList<>();
        List<Integer>positive=new ArrayList<>();
        for(int num:arr){
            if(num<0){
                negative.add(num);
            }else{
                positive.add(num);
            }
        }
        int i=0,nidx=0,pidx=0;
        while(nidx<negative.size() && pidx<positive.size()){
            arr[i++]=negative.get(nidx++);
            arr[i++]=positive.get(pidx++);
        }
        while (nidx<negative.size()){
            arr[i++]=negative.get(nidx++);
        }
        while (pidx<positive.size()){
            arr[i++]=positive.get(pidx++);
        }
        return arr;

    }
    public static void main(String[] args) {
        int []arr={1, 2, 3, -4, -1, 4};
        int [] arr1=arrangebysign(arr);
        System.out.println(Arrays.toString(arr1));


    }
}
