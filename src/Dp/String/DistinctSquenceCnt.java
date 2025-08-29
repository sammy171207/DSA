package Dp.String;

public class DistinctSquenceCnt {
    //recursive
    static int sequenceStringCnt(String s,String t){
        int n=s.length();
        int m=t.length();
        return  helper(n-1,s,m-1,t);
    }
    static int helper(int i,String s1,int j,String s2){
        if (j < 0) return 1;
        if (i < 0) return 0;

        int non_move=0;
        int not_Match=0;

        if(s1.charAt(i)==s2.charAt(j)){
             non_move=helper(i-1,s1,j,s2)+helper(i-1,s1,j-1,s2);

        }else{
            not_Match=helper(i-1,s1,j,s2);

        }
        return non_move+not_Match;
    }

    static int memoway(int i,String s1,int j,String s2 ,int[][]dp){
        if(i<0)return 0;
        if(j<0)return 1;
        if(dp[i][j]!=0)return dp[i][j];
        int non_move=0;
        int not_Match=0;

        if(s1.charAt(i)==s2.charAt(j)){
            non_move=helper(i-1,s1,j,s2)+helper(i-1,s1,j-1,s2);

        }else{
            not_Match=helper(i-1,s1,j,s2);

        }
        dp[i][j]=non_move+not_Match;
        return dp[i][j];
    }

    static  int tabluation(String s,String t){
        int n=s.length();
        int m=t.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String t="bag";
        String s="babgbag";
        int [][]dp=new int[s.length()][t.length()];

        System.out.println(sequenceStringCnt(s,t));
        System.out.println(memoway(s.length()-1,s,t.length()-1,t,dp));
        System.out.println(tabluation(s,t));
    }
}
