package Dp;

public class UniquePathWithDeadCell {
    static int cntPath(int[][]obstach ){
        int m=obstach.length;
        int n=obstach[0].length;
       return helper( m-1, n-1,obstach);
    }
    private static int helper(int i,int j,int[][]arr){
        if((i>=0 && j>=0)&& arr[i][j]!=0)return 0;
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        int up=arr[i][j]+helper(i-1,j,arr);
        int down=arr[i][j]+helper(i,j-1,arr);
        return up+down;
    }
    public static void main(String[] args) {
int[][]obstacle={{0,1},{0,0}};
        System.out.println(cntPath(obstacle));

    }
}
