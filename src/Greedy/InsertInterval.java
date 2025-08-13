package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    static int[][] insertInterval(int[][]interval,int[]newInterval){
     List<int[]>res=new ArrayList<>();
     int i=0;
     while(i< interval.length && interval[i][1]<newInterval[0]){
         res.add(interval[i]);
         i++;
     }
     while(i<interval.length && interval[i][0]<=newInterval[1]){
         newInterval[0]=Math.min(interval[i][0],newInterval[0]);
         newInterval[1]=Math.max(interval[i][1],newInterval[1]);
         i++;
     }
     res.add(newInterval);
     while(i<interval.length ){
         res.add(interval[i]);
         i++;
     }
     return  res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int [][]intervals = {{1,3},{6,9}};
        int []newInterval={2,5};

        int[][]ans=insertInterval(intervals,newInterval);
        for(int[]x:ans){
            System.out.println(Arrays.toString(x));
        }
    }
}
