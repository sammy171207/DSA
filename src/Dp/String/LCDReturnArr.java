package Dp.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCDReturnArr {
   static String longestStr(String s1,String s2){
       int n=s1.length();
       int m=s2.length();
       int[][]dp=new int[n+1][m+1];
       for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               if(s1.charAt(i-1)==s2.charAt(j-1)){
                   dp[i][j]=1+dp[i-1][j-1];
               }else{
                   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               }
           }
       }
       int i=n,j=m;
       StringBuilder str=new StringBuilder();
       while (i>0 && j>0){
           if(s1.charAt(i-1)==s2.charAt(j-1)){
               str.append(s1.charAt(i-1));
               i--;
               j--;
           }else if (dp[i-1][j]>dp[i][j-1]){
              i--;
           }else {
               j--;
           }
       }
       for(int[]row:dp){
           System.out.println(Arrays.toString(row));
       }

       return  str.reverse().toString();
   }

    public static void main(String[] args) {
        String str1="mnop";
        String str2="mnq";
        System.out.println(longestStr(str1,str2));
    }
}
