package BinarySearch;

public class RacerQuestion {
    static  int raceTrack(int []arr,int noOfRacer){
        if(noOfRacer>= arr.length) return -1;
        int str=0,end=(int)1e9;
        int ans=-1;
        while (str<=end){
         int mid = str + (end - str) / 2;
            if(isPossible(arr,noOfRacer,mid)){
                ans=mid;
                str=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int noOfRacer, int mid) {
        int kidPalaced=1;
        int lastKid=arr[0];
        for(int i=1;i<arr.length;i++){
             if(arr[i]-lastKid>=mid){
                 kidPalaced++;
                 lastKid=arr[i];
             }
        }
        return kidPalaced>=noOfRacer;
    }

    public static void main(String[] args) {
    int []arr={1,2,4,8,9};
    int noofRacer=3;
     int ans=raceTrack(arr,noofRacer);
        System.out.println(ans);
    }
}
