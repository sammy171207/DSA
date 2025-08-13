package Greedy;

import java.util.Arrays;

public class OverLapping_I {
    static int minimalRemoval(int[][]interval){
        Arrays.sort(interval,(a,b)->a[1]-b[1]);
//        for(int[]row:interval){
//            System.out.println(Arrays.toString(row));
//        }
        int cnt=1;
        int lastInterval=interval[0][1];
        for(int i=1;i<interval.length;i++){
            if(interval[i][0]>=lastInterval){
                lastInterval=interval[i][1];
                cnt++;
            }
        }
        return interval.length-cnt;
    }
    public static void main(String[] args) {
        int [][]intervals={{1,2},{2,3},{3,4},{1,3}};
        int[][]intervals1={{1,2},{1,2},{1,2}};
        System.out.println(minimalRemoval(intervals));
        System.out.println(minimalRemoval(intervals1));
    }
}
