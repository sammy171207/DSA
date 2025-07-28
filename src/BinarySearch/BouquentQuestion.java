package BinarySearch;

public class BouquentQuestion {
    static int min(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
        }
        return min;
    }
    static int max(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    static boolean isPossible(int[] arr, int day, int target, int condition) {
        int cnt = 0;
        int noofBouquet = 0;

        for (int j : arr) {
            if (j <= day) {
                cnt++;
                if (cnt == condition) {
                    noofBouquet++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
        }

        return noofBouquet >= target;
    }
    static int minimumNumberofDay(int[]arr,int m,int k){
        int low=min(arr);
        int high=max(arr);
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(arr,mid,m,k)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums={7, 7, 7, 7, 13, 11, 12, 7};
        int m=2;
        int k=3;
        int result=minimumNumberofDay(nums,m,k);
        System.out.println(result);
    }
}
