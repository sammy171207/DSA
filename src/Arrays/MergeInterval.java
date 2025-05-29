package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    static int[][] merge(int[][] intervals){
        if(intervals.length<=1) return  intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merge=new ArrayList<>();
        int []current=intervals[0];
        for(int i=1;i<intervals.length;i++){
           if(intervals[i][0]<=current[1]){
               current[1]=Math.max(current[1],intervals[i][1]);
           }
           else{
          merge.add(current);
           current=intervals[i];
           }
        }
        merge.add(current);
        return  merge.toArray(new int[merge.size()][]);

    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
