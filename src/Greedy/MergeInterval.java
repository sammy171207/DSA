package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    static int[][]merge(int[][]arr){

        if (arr.length == 0) return new int[0][];

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]>res=new ArrayList<>();
        int str=arr[0][0];
        int end=arr[0][1];
        System.out.println(str+" "+end);
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
              end=Math.max(end,arr[i][1]);
            }else{
                res.add(new int[]{str,end});
                str=arr[i][0];
                end=arr[i][1];
            }
        }
        res.add(new int[]{str, end});
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int[] []intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][]mergeInterval=merge(intervals);
        for (int[] row : mergeInterval) {
            System.out.println(Arrays.toString(row));
        }

    }
}
