package BinarySearch;

public class FirstAndLast {
    static int searchRange(int []arr,int target){
        int ans=0;
        int str=0;
        int end=arr.length-1;
        while (str<=end){
            int mid=str+(end-str)/2;
            if(arr[mid]==target){
                System.out.println(ans+"s");
               return mid;
            }
            else if(arr[mid]<target){
                str=mid+1;
                ans=str;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(searchRange(arr,target));
//        int []ans =searchRange(arr,target);
//        for(int x:ans){
//            System.out.print (x);
//        }

    }
}
