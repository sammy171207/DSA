package BinarySearch;

public class MinimumDaytoShipPackage {
    static  int maxVal(int[]nums){
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }
        return max;
    }
    private static int sumofall(int[] arr) {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;
    }
    static int minimumCapacity(int[]arr,int day){
        int result=-1;
        int low=maxVal(arr);
        int high=sumofall(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            int requiredDay=isPossible(arr, mid, day);
            if(requiredDay<=day){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }

    private static int isPossible(int[] arr, int mid, int day) {
        int required = 1;
        int load=0;
        for(int x:arr){
            if(required>day)
                return required;
            if(load + x > mid){
                required++;
                load = x;
            }else{
                load += x;
            }

        }
        return required;
    }


    public static void main(String[] args) {
        int[]weight={3,2,2,4,1,4};
        int day=3;
       int ans= minimumCapacity(weight,day);
        System.out.println(ans);
    }
}
