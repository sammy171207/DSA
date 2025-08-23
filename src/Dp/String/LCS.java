package Dp.String;

import java.util.Arrays;

public class LCS {
    //recursive way
    static int longestcommonStringleng(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();

        return helper(n1-1,str1,n2-1,str2);
    }
    static int helper(int idx1,String s1,int idx2,String s2){
        if(idx1<0 || idx2<0) return 0;
        int match = 0, notMatch=0;
      if(s1.charAt(idx1)==s2.charAt(idx2)){
         match=1+helper(idx1-1,s1,idx2-1,s2);
      }else{
         notMatch =0+Math.max(helper(idx1-1,s1,idx2,s2),helper(idx1,s1,idx2-1,s2));
      }
      return match+notMatch;
    }

    static int memoway(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int[][]dp=new int[n][m];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return helper1(n-1,str1,m-1,str2,dp);
    }
    static int helper1(int idx1,String s1,int idx2,String s2,int[][]dp){
        if(idx1<0 || idx2<0) return 0;
        int match = 0, notMatch=0;
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            match=1+helper(idx1-1,s1,idx2-1,s2);
        }else{
            notMatch =0+Math.max(helper(idx1-1,s1,idx2,s2),helper(idx1,s1,idx2-1,s2));
        }
        dp[idx1][idx2]=match+notMatch;
        return dp[idx1][idx2];
    }
    public static void main(String[] args) {
        String str1="mnop";
        String str2="mnq";

        System.out.println(longestcommonStringleng(str1,str2));
        System.out.println(memoway(str1,str2));

    }
}
