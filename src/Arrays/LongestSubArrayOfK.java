package Arrays;

import java.util.HashMap;

public class LongestSubArrayOfK {
    static int longsubtar(int[]arr,int target){
        int longsublen=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;  int cnt=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k] +" ");

                    cnt++;
                    if(sum==target){
                        if(longsublen<cnt){
                            longsublen=cnt;
                        }
                    }


                }
                System.out.println("sum "+sum);
            }
        }
        return longsublen;
    }

    static int optimalApproach(int[]arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;int maxlength=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==target) {
                maxlength=i+1;
            }
            if(map.containsKey(sum-target)){
                maxlength = Math.max(maxlength, i - map.get(sum - target));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[]arr={-5, 8, -14, 2, 4, 12};
        int target=-5;
        int sol=optimalApproach(arr,target);
        System.out.println(sol);

    }
}
