package Greedy;

import java.sql.Array;
import java.util.Arrays;

public class JobSequencing {
  static int[] maximumProfitandCntOfDone(int[][]arr){
      int maxTime=Integer.MIN_VALUE;
      for(int[]row:arr){
          maxTime=Math.max(maxTime,row[1]);
      }
      int[] Dummy=new int[maxTime+1];
      int cnt=0;
      int totalProfit=0;
      Arrays.sort(arr,(a,b)->b[2]-a[2]);
      for(int x[]:arr){
          if(x[0]==0) continue;
          for(int i=x[1];i>0;i--){
              if(Dummy[i]==0){
                  Dummy[i]=x[0];
                  totalProfit+=x[2];
                  cnt++;
                  break;
              }
          }
      }
      return  new int[]{cnt,totalProfit};
      }
    public static void main(String[] args) {
        int[][] jobs = {
                {1, 2, 100},
                {2, 1, 19},
                {3, 2, 27},
                {4, 1, 25},
                {5, 1, 15}
        };

        int []ans=maximumProfitandCntOfDone(jobs);
      for(int x:ans){
          System.out.print(x+" ");
      }
    }
}