package Top15.String;

public class LCSubstring {
    static int lengthLcsubstring(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        int max=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
//                    System.out.println(dp[i][j]);
                    max=Math.max(max,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s1="abcdxyz";
        String s2="xyzabcd";
        System.out.println(lengthLcsubstring(s1,s2));
    }
}
