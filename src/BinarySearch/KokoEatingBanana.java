package BinarySearch;

public class KokoEatingBanana {
    static  int max(int[]arr){
        int maxumNum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxumNum=Math.max(arr[i],maxumNum);
        }
        return maxumNum;
    }
    static  int minibanana(int[]arr,int hr,int n){
        int low=1;
        int high=max(arr);
        while (low<=high){
            int mid=low+(high-low)/2;
            int totalhour=canEat(arr,mid);
//            System.out.println(totalhour);
            if(totalhour>hr){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    static int canEat(int[] arr, int speed) {
        int totalHr = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHr += Math.ceil((double) arr[i] / speed);
        }
        return totalHr;
    }

    public static void main(String[] args) {
        int n=4;
        int [] nums={7, 15, 6, 3};
        int hr=8;
        System.out.println(minibanana(nums,hr,n));

    }
}
