package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    static int searchInsertIdx(int[][] intervals, int[] interval) {
        int insertPosition = -1, left = 0, right = intervals.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int[] current = intervals[mid]; // Fix: correct array reference
            if (current[0] < interval[0]) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        insertPosition = left;
        return insertPosition;
    }
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

    static int[][] mergeOver(int[][] intervals, int[] target) {
        int pos = searchInsertIdx(intervals, target);
        int[][] result;

        if (pos > 0) {
            // Check for overlap before merging
            if (intervals[pos - 1][1] >= target[0]) {
                intervals[pos - 1][1] = Math.max(intervals[pos - 1][1], target[1]);
                result = merge(intervals); // Assuming merge() handles overlaps
            } else {
                result = new int[intervals.length + 1][2];
                System.arraycopy(intervals, 0, result, 0, pos);
                result[pos] = target;
                System.arraycopy(intervals, pos, result, pos + 1, intervals.length - pos);
            }
        } else {
            result = merge(intervals); // Handling the case where it needs merging
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
         int[]interval={4,8};
        int[][] result = mergeOver(intervals,interval);

        for (int[] x : result) {
            System.out.println(Arrays.toString(x));
        }
    }
}
