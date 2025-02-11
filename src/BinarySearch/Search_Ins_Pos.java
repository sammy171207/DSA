package BinarySearch;

public class Search_Ins_Pos {
    static  int insertpos(int[]arr,int target){
        int start=0;
        int n=arr.length;
        int end=n-1;
        int a=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return start +(end-start)/2;
    }
    public static void main(String[] args) {
  int arr[]={1,3,5,6};
  int target=2;
       int out=insertpos(arr,target);
        System.out.println(out);
    }
}
