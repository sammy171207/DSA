package Dp;

import java.util.Arrays;

public class UniquePath {
    //recursive way
    static int uniquePathNo(int i,int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        int left=uniquePathNo(i-1,j);
        int right=uniquePathNo(i,j-1);
        return left+right;
    }

    // memoway
    static int memoway(int i, int j, int[][] memo) {
        if (i == 0 && j == 0) return 1;
        if (i < 0 || j < 0) return 0;
        if (memo[i][j] != -1) return memo[i][j];

        int left = memoway(i - 1, j, memo);
        int right = memoway(i, j - 1, memo);
        memo[i][j] = left + right;
        return memo[i][j];
    }

    public static void main(String[] args) {
        int m=3,n=7;
        int cnt=uniquePathNo(3-1,7-1);
        int[][]memo=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(memo[i],-1);
        }
        System.out.println(cnt);
        System.out.println(memoway(m-1,n-1,memo));
    }
}
