package Bit;

public class LargestCombination {
    static  int largestCombination(int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int x:arr){
                if((x&(1<<i))!=0){
                    cnt++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
